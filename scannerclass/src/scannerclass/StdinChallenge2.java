package scannerclass;

import java.util.Scanner;

public class StdinChallenge2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int i = scan.nextInt();

        // Prompt the user to enter a double
        System.out.print("Enter a double: ");
        double d = scan.nextDouble();

        // Read the remaining newline character
        scan.nextLine();

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String s = scan.nextLine();

        // Close the Scanner
        scan.close();

        // Print the values with labels
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
