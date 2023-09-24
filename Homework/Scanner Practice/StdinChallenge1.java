package scannerclass;

import java.util.Scanner;

public class StdinChallenge1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read and print the first integer
        int a = scan.nextInt();
        System.out.println(a);

        // Read and print the second integer
        int b = scan.nextInt();
        System.out.println(b);

        // Read and print the third integer
        int c = scan.nextInt();
        System.out.println(c);

        // Close the Scanner
        scan.close();
    }
}
