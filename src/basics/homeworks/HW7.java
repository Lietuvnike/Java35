package basics.homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {
        /* Create a JAVA program that allows you to enter a size of an array (type int). Then ask for user to
        enter each element one by one.
            * Ask for user to enter a positive number that will be the arrays size
            * Create an empty array that will contain int data type values in size of entered value
            * Using for loop ask user to enter array elements one by one
            * Print out all array elements. */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the required size of the array : ");
        int arrayLength = scanner.nextInt();
        int sourceArray = 0;
        int sumElements = 0;

        int j = 1;
        int[] myArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Please enter element number: " + j++ + ") ");
            int answerInput = scanner.nextInt();
            myArray[i] = answerInput;
            sumElements += answerInput;


            }
        System.out.println("Source Array: " + Arrays.toString(myArray));
        System.out.println("Sum of all elements: " + sumElements);




    }
}