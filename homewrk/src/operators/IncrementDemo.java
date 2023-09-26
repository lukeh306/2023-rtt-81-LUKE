package operators;

public class IncrementDemo {
    public static void main(String[] args) {
        int number = 5; // Initialize the variable with an initial value
        int incrementBy = 1; // Amount to increment by

        // Loop to demonstrate incrementing the variable multiple times
        for (int i = 1; i <= 3; i++) {
            // Method 1: Using the addition operator
            number = number + incrementBy;
            System.out.println("Method 1 - Value: " + number);

            // Method 2: Using the compound assignment operator (+=)
            number += incrementBy;
            System.out.println("Method 2 - Value: " + number);

            // Method 3: Using the increment (++) operator
            number++;
            System.out.println("Method 3 - Value: " + number);
        }
    }
}

