package homeworks;

import java.util.Scanner;

public class HW9 {
    public static void main(String[] args) {
        /*Write an application, that will draw Christmas tree according to examples below. The height of the tree
        should be read from user (positive integer). Use scanner to ask user for tree size
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input tree size ");
        int height = scanner.nextInt();


        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
