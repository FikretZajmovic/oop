package week2;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the number(of the power): ");
        int numberPow = reader.nextInt();
        int sum = 0;
        for(int i = 0; i <= numberPow; i++)
        {
            int result = (int)Math.pow(2,i);
            sum += result;
            result = 0;
        }
        System.out.println("The result is: " + sum);
    }
}
