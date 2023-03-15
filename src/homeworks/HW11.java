package homeworks;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW11 {
    public static void main(String[] args) {
        /* Create a JAVA program that allows you to enter Personal Number (Example 112233-12345) as a String value
        and you should get output if this input is following right pattern (exactly 6 any numbers followed by exactly
        one “-” and then exactly 5 more any numbers). Don’t worry about other limitations like month in personal
        code, just look for this pattern.
         Ask for user to enter a String value
         Create a Pattern that will check Personal number pattern
         Use matches method to find out if indeed that matches the pattern
         If it does match then print out something like “Your inputted personal number is valid”. If it’s not that
        something like “Your inputted personal number is not valid”
         Add ability to enter and check personal code as many times as user wants using a while loop and asking to
        enter user a letter ‘y’ for yes and ‘n’ for no. */

        System.out.println("Please enter name: ");
        Scanner scanner = new Scanner(System.in);
        char again = 'y';
        Pattern pattern = Pattern.compile("[0-9]{6}-[0-9]{5}");

        while (again == 'y') {
            System.out.println("Enter your personal number");
            String plateNumber = scanner.nextLine().trim();

            Matcher matcher = pattern.matcher(plateNumber);
            boolean matches = matcher.matches();

            if (matches) {
                System.out.println("Your personal number is valid");
            } else {
                System.out.println("Your personal number is not valid");
            }
            System.out.println("Do you want to check your personal number again? y/n ");
            again = scanner.next().charAt(0);
            scanner.nextLine();
        }
    }
}



