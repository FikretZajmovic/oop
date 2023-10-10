package week2Exercises;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String correctPass = "Fikret";
        while(true) {
            System.out.println("Type the password: ");
            String pass = reader.nextLine();
            if(pass.equals(correctPass))
            {
                System.out.println("Correct!");
                System.out.println("Secret message is: Sead");
                break;
            }
            else
            {
                System.out.println("Wrong!");
            }
        }
    }
}
