package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class HW8 {
    public static void main(String[] args) {
        /* Use the same functionality from previous task (change array to float) and create array. Sum all elements
        in the array and calculate average grade.
            Ask for user to enter a positive number that will be the arrays size
            Create an empty array that will contain float data type values in size of entered value
            Using for loop ask user to enter array elements one by one
            Calculate and print out all value average
            Print out count of grades
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the required size of the array : ");
        float arrayLength = scanner.nextInt();
        float sourceArray = 0f;
        float sumElements = 0f;
        float averageElements = sumElements / sourceArray;


        float[] myArray = new float[0];
        for (float i = 0; i < arrayLength; i++) {
            System.out.println("Please enter element number: " + (i + 1));
            float answerInput = scanner.nextInt();
            myArray = new float[]{answerInput};
            sumElements += answerInput;
        }
        System.out.println("Average of Array: " + averageElements);
        System.out.println("Sum of all elements: " + sumElements);
    }
}
