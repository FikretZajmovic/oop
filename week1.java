import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Fikret Zajmovic"); // 1#

        System.out.println("Hello World !");
        System.out.println(" (And all the people of world)"); // 2#

        int number = 365 * 24 * 60 * 60;
        System.out.println("There are " + number + " seconds in a year"); // 3#

        System.out.println("Enter the first number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());
        System.out.println("Enter the second number: ");
        int secondNumber = Integer.parseInt(reader.nextLine());
        System.out.println("Sum of these two numbers is: " + (firstNumber + secondNumber)); // 4#

        System.out.println("Type a number: ");
        int someNumber = Integer.parseInt(reader.nextLine());

        if (someNumber > 0)
        {
            System.out.println("The number is positive");
        }
        else if (someNumber < 0)
        {
            System.out.println("The number is negative");
        }
        else
        {
            System.out.println("Neither positive nor negative"); // 5#
        }

        System.out.println("Enter first number: ");
        int numberOne = Integer.parseInt(reader.nextLine());
        System.out.println("Enter second number: ");
        int numberTwo = Integer.parseInt(reader.nextLine());

        if (numberOne > numberTwo)
        {
            System.out.println("Greater number is: " + numberOne);
        }
        else if (numberTwo > numberOne)
        {
            System.out.println("Greater number is: " + numberTwo);
        }
        else
        {
            System.out.println("Numbers are equal"); // 6#
        }
    }
}
