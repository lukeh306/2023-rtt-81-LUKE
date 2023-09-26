package operators;

public class BinaryLeftShift {
	public static void main(String[] args) {
        // For value 9:
        int x = 9;
        // Predicted decimal value after left shift by 1: 18
        // Predicted binary string: 10010
        x = x << 1;
        System.out.println("Decimal (9 << 1): " + x);
        System.out.println("Binary (9 << 1): " + Integer.toBinaryString(x));
        
        // For value 17:
        x = 17;
        // Predicted decimal value after left shift by 1: 34
        // Predicted binary string: 100010
        x = x << 1;
        System.out.println("Decimal (17 << 1): " + x);
        System.out.println("Binary (17 << 1): " + Integer.toBinaryString(x));

        // For value 88:
        x = 88;
        // Predicted decimal value after left shift by 1: 176
        // Predicted binary string: 10110000
        x = x << 1;
        System.out.println("Decimal (88 << 1): " + x);
        System.out.println("Binary (88 << 1): " + Integer.toBinaryString(x));
    }
}
