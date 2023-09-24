package operators;

public class RelationalOperatorsDemo {
    public static void main(String[] args) {
        // Declare and initialize integer variables
        int x = 10, y = 5;

        // Compare and print the results using relational operators
        System.out.println("x > y : " + (x > y));   // true, because 10 is greater than 5
        System.out.println("x < y : " + (x < y));   // false, because 10 is not less than 5
        System.out.println("x >= y : " + (x >= y)); // true, because 10 is greater than or equal to 5
        System.out.println("x <= y : " + (x <= y)); // false, because 10 is not less than or equal to 5
        System.out.println("x == y : " + (x == y)); // false, because 10 is not equal to 5
        System.out.println("x != y : " + (x != y)); // true, because 10 is not equal to 5

        // Declare and initialize more integer variables
        int variable1 = 50, variable2 = 100, variable3 = 50;

        // Compare and print the results of equality checks
        System.out.println("variable1 = " + variable1);
        System.out.println("variable2 = " + variable2);
        System.out.println("variable3 = " + variable3);
        
        System.out.println("variable1 == variable2: " + (variable1 == variable2)); // false
        System.out.println("variable1 == variable3: " + (variable1 == variable3)); // true
    }
}

