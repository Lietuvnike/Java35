package homeworks;

import java.util.Arrays;

public class HW13 {
    public static void main(String[] args) {

        /*Min & Max Methods:
        Write a Java program to find arrays max value and min value. Write two methods max() and min() that take in as an
        argument int type array. Loop through array and find max value in max() method and min value in min() method.
        Both methods should return int value.
        Example method declaration getting array as argument public static int max(int []my_array){
         Create example array with int values
         Print out arrays elements
         Call max() passing array and print out max value in array
         Call min() passing array and print out min value in array*/

        int[] myArray = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println("Original array: " + Arrays.toString(myArray));

        System.out.println(max(myArray));
        System.out.println(min(myArray));

    }

    //Max
    public static int max(int [] array){
        int max = array[0];
        for(int i = 1; i< array.length;i++);{
            int i = 0;
            if(array[i] < max){
                max = array[i];
            }
        }
        return max;
    }

        //Min
    public static int min(int [] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;

    }
}
