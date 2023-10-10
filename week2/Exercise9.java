package week2Exercises;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        drawNumbersPyramid(5);
        drawNumbersPyramid2(5);
    }
    public static void drawNumbersPyramid(int rows)
    {
        for(int i = 1; i <= rows; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void drawNumbersPyramid2(int rows)
    {
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
