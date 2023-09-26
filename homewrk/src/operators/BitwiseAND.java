package operators;

public class BitwiseAND {
	 public static void main(String[] args) {
	        int x = 7;
	        int y = 17;

	        // Predicted result of x & y: 1 (binary: 0001)
	        int z = x & y;

	        System.out.println("x & y: " + z);
	        System.out.println("Binary (x & y): " + Integer.toBinaryString(z));
	    }
	}
