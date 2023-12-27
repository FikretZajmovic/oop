package week12;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.List;

class ChatServer {
    private List<ClientHandler> clients = new ArrayList<>();

    public static void main(String[] args) {
        int port = 12345;
        ChatServer chatServer = new ChatServer();
        chatServer.start(port);
    }

    public void start(int port) {
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server is running on port " + port);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                ClientHandler clientHandler = new ClientHandler(clientSocket);
                clients.add(clientHandler);

                Thread thread = new Thread(clientHandler);
                thread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private synchronized void broadcastMessage(String message, ClientHandler sender) {
        for (ClientHandler client : clients) {
            if (client != sender) {
                client.sendMessage(sender.getUsername() + ": " + message);
            }
        }
    }

    private class ClientHandler implements Runnable {
        private Socket socket;
        private BufferedReader reader;
        private PrintWriter writer;
        private String username;

        public ClientHandler(Socket socket) {
            try {
                this.socket = socket;
                this.reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                this.writer = new PrintWriter(socket.getOutputStream(), true);
                this.username = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public String getUsername() {
            return username;
        }

        public void sendMessage(String message) {
            writer.println(message);
        }

        @Override
        public void run() {
            try {
                System.out.println(username + " joined the chat.");

                broadcastMessage(username + " joined the chat.", this);

                while (true) {
                    String message = reader.readLine();
                    if (message == null) break;

                    broadcastMessage(message, this);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    socket.close();
                    clients.remove(this);
                    broadcastMessage(username + " left the chat.", this);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class ChatClient {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java ChatClient <username> <server-ip>");
            System.exit(1);
        }

        String username = args[0];
        String serverIp = args[1];
        int port = 12345;

        try {
            Socket socket = new Socket(serverIp, port);
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

            writer.println(username);

            Thread receiveThread = new Thread(() -> {
                try {
                    while (true) {
                        String message = reader.readLine();
                        if (message == null) break;
                        System.out.println(message);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            receiveThread.start();

            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
            String input;
            while ((input = consoleReader.readLine()) != null) {
                writer.println(input);
            }

            socket.close();
            receiveThread.join();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ChatApplication {
    public static void main(String[] args) {
        Thread serverThread = new Thread(() -> {
            ChatServer.main(new String[]{});
        });
        serverThread.start();

        ChatClient.main(new String[]{"User", "127.0.0.1"});
    }
}
