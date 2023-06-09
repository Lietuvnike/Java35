package homeworks;

import java.util.Scanner;

public class HW12 {
    public static void main(String[] args) {
        /*Create a JAVA program that allows you to enter a String value and gives you output if what you entered is
        palindrome or not. Make sure that your code will accept examples like this (“Anna”, “akA”) where some letters
        are uppercase they still are considered as palindromes. And also cases where some extra spaces have been
        passed (“  madam     ”, “           racecar”).
         Ask for user to enter a String value
         Create a for loop to check if first element of the String is equal to the last one and then second is equal
         to second from the end and so on until you have compared all of the elements.
          Create a logic that will make sure if all of the checks were true and in that case you can print that
         passed value from the user is Palindrome otherwise not.
          User printf formatting to get output similar to the examples below
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a name: ");
        String word = scanner.nextLine().toLowerCase().trim();

        int checkPassed = 0;

        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) == word.charAt(word.length() - i - 1)) {
                checkPassed++;
            } else {
            }
        }

        if (checkPassed >= word.length() / 2) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is a palidrome");
        }
    }
}
