package array;

public class ArrayPractice5 {
    public static void main(String[] args) {
        // Create an integer array with a length of 5
        int[] myArray = new int[5];

        // Loop through the array and assign values
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i; // Assign the value of 'i' to the array element at index 'i'
        }

        // Print the array elements
        System.out.println("Array elements after assignment:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("myArray[" + i + "] = " + myArray[i]);
        }
    }
}
