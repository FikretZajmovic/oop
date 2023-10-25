package week2;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNumber = reader.nextInt();

        System.out.println("Enter the last number: ");
        int lastNumber = reader.nextInt();

        while(firstNumber <= lastNumber)
        {
            System.out.println(firstNumber);
            firstNumber++;
        }
    }
}
