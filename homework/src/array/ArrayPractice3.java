package array;

/* Write a program that creates an array of String type and initializes it 
 * with the strings “red,” “green,” “blue,” and “yellow.” Print out the array length. 
 * Make a copy using the clone( ) method. 
 * Use the Arrays.toString( ) method on the new array to verify that the original array was copied.
 */

import java.util.Arrays;

public class ArrayPractice3 {
    public static void main(String[] args) {
        // Create an array of String type and initialize it
        String[] originalArray = { "red", "green", "blue", "yellow" };

        // Print the original array length
        System.out.println("Original Array Length: " + originalArray.length);

        // Make a copy of the original array using clone()
        String[] copiedArray = originalArray.clone();

        // Verify that the original array was copied using Arrays.toString()
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Copied Array:   " + Arrays.toString(copiedArray));
    }
}
