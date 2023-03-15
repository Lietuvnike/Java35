package homeworks;

import java.util.Arrays;

public class HW10 {
    public static void main(String[] args) {
        /* Write a Java program to reverse an array of integer values.
         Create an array (int type) put some random values in array and print out all elements.
         Use for loop to iterate through array and switch places with first and last element and then second from
        beginning and second from end etc. with rest of the elements
         Print out array elements using Arrays.toString() method
        PS. You are not allowed to create another array. Only change original one. */

        int[] myArray = {1, 2, 3, 4, 5, 6, 20, 7, 8, 9, 10, 11, 12};
        System.out.println("Original array: " + Arrays.toString(myArray));
        int left, right = 0;
        right = myArray.length - 1;

        for (left = 0; left < right; left ++, right--){
            int reverse1 = myArray[left];
            myArray[left] = myArray [right];
            myArray[right] = reverse1;
        }
        System.out.println("Reverse array: " + Arrays.toString(myArray));



    }
}
