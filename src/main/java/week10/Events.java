package week10;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Events{
    private static final int numberOfRecords = 1000000;
    private static final String[] eventTypes = {"Login", "Logout", "Purchase", "ViewPage", "Error"};
    public static void generateEventsFile(String filename) throws IOException
    {
        try(PrintWriter writer = new PrintWriter(new FileWriter(filename)))
        {
            Random random = new Random();
            for(int i = 0; i < numberOfRecords; i++)
            {
                String timestamp = generateRandomTimestamp();
                String eventType = eventTypes[random.nextInt(eventTypes.length)];
                int userID = random.nextInt(999 + 1);

                String event = timestamp + "," + eventType + "," + userID;
                writer.println(event);
            }
        }
    }

    public static void readEventsFile(String filename) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
        String tempLine;
        int iteration = 1;

        while((tempLine = bufferedReader.readLine()) != null)
        {
            System.out.println("Iteration " + iteration + ": " + tempLine);
            iteration = (iteration % 5) + 1;
        }
        bufferedReader.close();
    }

    private static String generateRandomTimestamp() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long randomTimestamp = System.currentTimeMillis() - (long) (Math.random() * 365 * 24 * 60 * 60 * 1000);
        return dateFormat.format(new Date(randomTimestamp));
    }

    public static void main(String[] args) throws IOException{
        String filename = "events.txt";

        generateEventsFile(filename);
        readEventsFile(filename);
    }
}
