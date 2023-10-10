package week2Exercises;

import java.util.Scanner;

public class Exercise7 {
    private static void printStars(int amount)
    {
        int i = 0;
        while(i < amount)
        {
            System.out.print("*");
            i++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        printStars(5);
        printStars(3);
        printStars(8);
    }
}
