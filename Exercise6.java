package week2Exercises;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("How many times do you want to print the text: ");
        int number = reader.nextInt();
        int i = 0;
        while(i < number)
        {
            printText();
            i++;
        }

    }
    public static void printText()
    {
        System.out.println("In the beginning there were the swamp, the hoe and Java");
    }
}
