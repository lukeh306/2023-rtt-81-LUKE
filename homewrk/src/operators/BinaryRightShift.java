package operators;

public class BinaryRightShift {
    public static void main(String[] args) {
        // For value 225:
        int x = 225;
        // Predicted decimal value after right shift by 2: 56
        // Predicted binary string: 111000
        x = x >> 2;
        System.out.println("Decimal (225 >> 2): " + x);
        System.out.println("Binary (225 >> 2): " + Integer.toBinaryString(x));

        // For value 1555:
        x = 1555;
        // Predicted decimal value after right shift by 2: 388
        // Predicted binary string: 110001100
        x = x >> 2;
        System.out.println("Decimal (1555 >> 2): " + x);
        System.out.println("Binary (1555 >> 2): " + Integer.toBinaryString(x));

        // For value 32456:
        x = 32456;
        // Predicted decimal value after right shift by 2: 8114
        // Predicted binary string: 1111110111010
        x = x >> 2;
        System.out.println("Decimal (32456 >> 2): " + x);
        System.out.println("Binary (32456 >> 2): " + Integer.toBinaryString(x));
    }
}
