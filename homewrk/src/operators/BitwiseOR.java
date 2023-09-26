package operators;

public class BitwiseOR {
    public static void main(String[] args) {
        int x = 7;
        int y = 17;

        // Predicted result of x | y: 23 (binary: 10111)
        int z = x | y;

        System.out.println("x | y: " + z);
        System.out.println("Binary (x | y): " + Integer.toBinaryString(z));
    }
}
