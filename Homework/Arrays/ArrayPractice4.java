package array;

public class ArrayPractice4 {
    public static void main(String[] args) {
        // Create an integer array with 5 elements
        int[] myArray = { 10, 20, 30, 40, 50 };

        // Print the value at the first index (index 0)
        System.out.println("Value at first index: " + myArray[0]);

        // Print the value at the last index (index = length - 1)
        System.out.println("Value at last index: " + myArray[myArray.length - 1]);

        try {
            // Attempt to print the value at index = length
            System.out.println("Value at index length: " + myArray[myArray.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Exception caught: " + e.getMessage());
        }

        try {
            // Attempt to assign a value to index 5
            myArray[5] = 60;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Exception caught: " + e.getMessage());
        }
    }
}
