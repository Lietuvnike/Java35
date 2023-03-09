package homeworks;

import java.util.Scanner;

public class HW9 {
    public static void main(String[] args) {
        /*Write an application, that will draw Christmas tree according to examples below. The height of the tree
        should be read from user (positive integer). Use scanner to ask user for tree size
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input tree size ");
        int score = scanner.nextInt();

        if (score <= 40.0f){
            System.out.println("Score is <= 40%");
        } else if (score <= 80.0f) {
            System.out.println("Score is <= 80%");
            if (score <= 60.0f){
                System.out.println("<= 60%");
            }else {
                System.out.println("Score is <= 100%");
            }

    }
}
