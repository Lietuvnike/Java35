package basics.homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class HWSamples {
    public static void main(String[] args) {
            int[] myArray = {1, 2, 3, 4, 5, 6, 20, 7, 8, 9, 10, 11, 12};
            System.out.println("Original array: " + Arrays.toString(myArray));
            //Personal code

        System.out.println("Enter your personal code: ");
            Scanner scanner = new Scanner(System.in);
            char again = 'y';

            while (again == 'y') {

                String test = scanner.nextLine();
                System.out.println("You are in while loop");

                System.out.println("Do you want to run again? ");
                again = scanner.next().charAt(0);
                //Fixing problem
                scanner.nextLine();
            }
        }

}
