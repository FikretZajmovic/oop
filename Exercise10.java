package week2Exercises;

import java. util. Random;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Random randomNumber = new Random();
        int number = randomNumber.nextInt(0, 101);

        int guessCounter = 0;

        while(true)
        {
            System.out.println("Guess the number: ");
            int guess = reader.nextInt();

            if(guess > number)
            {
                guessCounter++;
                System.out.println("The number is lesser, guesses made: " + guessCounter);
            }
            else if(guess < number)
            {
                guessCounter++;
                System.out.println("The number is greater, guesses made: " + guessCounter);
            }
            else
            {
                System.out.println("Congratulations, your guess is correct! ");
                break;
            }
        }
    }
}
