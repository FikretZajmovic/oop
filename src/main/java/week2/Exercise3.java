package week2;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int sum = 0;
        while(true)
        {
            int read = reader.nextInt();
            if(read == 0)
            {
                break;
            }
            else
            {
                sum += read;
            }
            System.out.println("Sum now: " + sum);
        }
        System.out.println("Sum in the end: " + sum);
    }
}
