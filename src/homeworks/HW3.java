package homeworks;

import javax.management.MBeanAttributeInfo;
import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        /*      Write an application, that will read one number from user (of type int)
        and check, if given number is "near" 100. A number is "near" 100 when
        difference between it and 100 is no bigger than 10.

        Your application should read one number (int) and print false or true on the screen,
        according to instructions above.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number from 1-200");
        int number = scanner.nextInt();
        if (number >= 1 && number <= 89) {
            System.out.println("False");
        } else if (number >= 90 && number <= 110) {
            System.out.println("True");
        } else if (number >= 111 && number <= 200) {
            System.out.println("False");
        } else {
            System.out.println("Invalid input");
        }

        //Other methods
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter a number");

        int input = scanner.nextInt();
        System.out.println(Math.abs(100 - input) <= 10);

    }

  }
