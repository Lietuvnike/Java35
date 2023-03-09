package tasks;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        /* Create aJAVA program that determinetes if year is leap or not. User should enter positive value and
         program should print out either  “Leap year” or “Not a leap year”
         Requirements:
          If input value from user is negative print out “Invalid input” and stop the program
          If input values is over year 2100 print out “You are looking too far in the future, live for today”

         How to calculate if it’s a leap year:
          it's divisible by 400, or
          it's divisible by 4 and at the same time it's not divisible by 100.
         Example: 1600 and 1512 are leap years, but 1700 and 1514 are not
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter year: ");
        int year = scanner.nextInt();

        if (year < 0) {
            System.out.println("Invalid input");
        } else if (year >2100) {
            System.out.println("You are looking too far in the future, live for today");
        } else if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not leap year");
        }

    }
}
