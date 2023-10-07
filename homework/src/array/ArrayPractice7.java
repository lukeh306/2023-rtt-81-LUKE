package array;

public class ArrayPractice7 {
    public static void main(String[] args) {
        // Create a String array with 5 elements
        String[] myArray = { "A", "B", "C", "D", "E" };

        // Swap the first element with the middle element
        int middleIndex = myArray.length / 2;
        
        String temp = myArray[0];   // Store the value of the first element in a temporary variable
        myArray[0] = myArray[middleIndex];  // Assign the value of the middle element to the first element
        myArray[middleIndex] = temp;  // Assign the value from the temporary variable to the middle element

        // Print the array after swapping
        System.out.println("Array elements after swapping:");
        for (String element : myArray) {
            System.out.println(element);
        }
    }
}
