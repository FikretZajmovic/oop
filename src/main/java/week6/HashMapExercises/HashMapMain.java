package week6.HashMapExercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapMain {
    public static void main(String[] args) {
        /* HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("matti","mage");
        hashmap.put("mikael","mixu");           1.Exercise
        hashmap.put("arto","arppa");
        System.out.println(hashmap.get("mikael")); */

        /* PromissoryNote mattisNote = new PromissoryNote();
        mattisNote.setLoan("Arto", 51.5);
        mattisNote.setLoan("Mikael", 30);

        System.out.println(mattisNote.howMuchIsTheDebt("Arto"));
        System.out.println(mattisNote.howMuchIsTheDebt("Joel"));
                                                                    2.Exercise (PromissoryNote)
        PromissoryNote mattisNote = new PromissoryNote();
        mattisNote.setLoan("Arto", 51.5);
        mattisNote.setLoan("Arto", 10.5);

        System.out.println(mattisNote.howMuchIsTheDebt("Arto")); */

        /* Dictionary dictionary = new Dictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("cembalo", "harpsichord");

        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("porkkana")); */

        /* Dictionary dictionary = new Dictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        System.out.println(dictionary.amountOfWords());

        dictionary.add("cembalo", "harpsichord");
        System.out.println(dictionary.amountOfWords()); */

        /* Dictionary dictionary = new Dictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("cembalo", "harpsichord");

        ArrayList<String> translations = dictionary.translationList();
        for(String translation: translations) {
            System.out.println(translation);
        } */

        Dictionary dictionary = new Dictionary();
        Scanner reader = new Scanner(System.in);
        TextUserInterface ui = new TextUserInterface(reader, dictionary);
        ui.start();
    }
}
