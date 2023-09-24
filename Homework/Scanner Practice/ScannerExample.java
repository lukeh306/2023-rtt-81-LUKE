package scannerclass;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read a string
        System.out.print("Enter a string: ");
        String myString = scanner.next();

        // Read an integer
        System.out.print("Enter an integer: ");
        int myInt = scanner.nextInt();

        // Consume the newline character in the input buffer
        scanner.nextLine();

        // Close the Scanner
        scanner.close();

        System.out.println("My String is: " + myString);
        System.out.println("My IntegerKog is: " + myInt);
        
        
    }
}

