package week6.HashMapExercises;

import java.util.Scanner;

public class TextUserInterface {
    private Scanner reader;
    private week6.HashMapExercises.Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }
    public void start() {
        System.out.println("Statement: ");
        System.out.println("  quit - quit the text user interface");
        System.out.println("  add - adds a word pair to the dictionary");
        System.out.println("  translate - asks a word and print its translation");
        System.out.println();
        while (true) {
            System.out.print("Statement: ");
            String statement = reader.nextLine();

            if (statement.equalsIgnoreCase("quit")) {
                System.out.println("Cheers!");
                break;
            }
            else if (statement.equalsIgnoreCase("add")) {
                add();
            }
            else if (statement.equalsIgnoreCase("translate")) {
                translate();
            }
            else {
                System.out.println("Unknown statement");
            }
        }
    }
    public void add() {
        System.out.print("In Finnish: ");
        String word = reader.nextLine();
        System.out.print("Translation: ");
        String translation = reader.nextLine();
        dictionary.add(word, translation);
        System.out.println();
    }

    public void translate() {
        System.out.print("Give a word: ");
        String word = reader.nextLine();
        System.out.println("Translation: " + dictionary.translate(word));
        System.out.println();
    }
}
