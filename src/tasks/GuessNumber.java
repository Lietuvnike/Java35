package tasks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        /*Create a JAVA program that allows you to enter a maximum random number for
        program to generate. Generate a random number from 0 to entered max number.
        And then using while loop ask user to guess the number. Allow user to guess as long
        as they enter the same number that was generated.
         Ask for user to enter a positive number
         Generate random number in range 0 – entered number
         Ask user to guess the number, allow to guess as long as they enter they enter
        generated number
         Congratulate user for guess the number */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter max random number");
        int max = scanner.nextInt();

        //Generate a random number from 0 - max number
        int rand = (int)(Math.random() * (max+1));
        //System.out.println("Generate random number = " + rand);
        System.out.println("Random number between 0 and " + max + " was generated");

        int guess;
        do {
            System.out.println("Guess the random number");
            guess = scanner.nextInt();

            if (guess < rand) {
                System.out.println("Try bigger");
            } else if (guess > rand) {
                System.out.println("Try smaller");
            }

        }while (guess != rand);

        System.out.println("Congradulations you won!");

    }
}
