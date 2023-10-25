package week2;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        printStars(5);
        printStarsReverse(5);
    }

    public static void printStars(int rows)
    {
        for(int i = 1; i <= rows; i++)
        {
            for(int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printStarsReverse(int rows)
    {
        for(int i = rows; i > 0; i--)
        {
            for(int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
