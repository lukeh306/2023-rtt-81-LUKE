package variables;

public class Variables {
	public static void main(String [] args)
	{
		/*Write a program that declares two integer variables, assigns an integer to each, and adds them together. 
		Assign the sum to a variable. Print out the result. */

		int a = 10;
		int b = 10;
		int c = a + b;
		System.out.println("c = " + c);
		
		/* Write a program that declares two double variables, assigns a number to each, and adds them together. 
		 * Assign the sum to a variable. Print out the result. */

		double d = 20.9;
		double e = 15.3; 
		double f = d + e;
		System.out.println("f = " + f);
		
		/*Write a program that declares an integer variable and a double variable, assigns numbers to each, and 
		 * adds them together. Assign the sum to a variable. Print out the result. What variable type must the sum be?
		 */

		int g = 15;
		double h = 12.23;
		double i = h + g;
		System.out.println("i = " + i);
			
		/*Write a program that declares two integer variables, assigns an integer to each, and divides the larger number 
		 * by the smaller number. Assign the result to a variable. Print out the result. Now change the larger number to a decimal. What happens? What corrections are needed?
		 */

		double k = 50.25; 
		int l = 10; 
		double m = k/l;
		System.out.println("m = " + m);
		
		/*Write a program that declares two double variables, assigns a number to each, and divides the larger 
		 * by the smaller number. Assign the result to a variable. Print out the result. Now, cast the result to an integer. Print out the result again.
		 */

		double n = 50.25;
		double o = 10.15; 
		double p = o/n;
		System.out.println("p = " + p);
		
		int q = (int) p;
		System.out.println("q (int) = " + q);
		
		/*Write a program that declares two integer variables, x and y, and assigns the number 5 to x and the 
		 * number 6 to y. Declare a variable r and assign y/x to it and print q. Now, cast y to a double and assign it to r. Print q again.
		 */
		
		int x = 5;
		int y = 6;
		int r = y/x; 
		System.out.println("q = " + r);

		// Write a program that declares a named constant and uses it in a calculation. Print the result.
		final int CONSTANT_VALUE = 10; 
		int result = CONSTANT_VALUE * 5;
		System.out.println("The result of the constant is " + result);
		
		/* Write a program where you create three variables that represent products at a cafe. The products could be beverages like coffee, cappuccino, espresso, green tea, etc. 
		 * Assign prices to each product. Create two more variables called subtotal and totalSale and complete an “order” for three items of the first product, four items of the second product, 
		 * and two items of the third product.  Add them all together to calculate the subtotal. Create a constant called SALES_TAX and add sales tax to the subtotal to 
		 * obtain the totalSale amount. Be sure to format the results to two decimal places.
		 */
		
		        // Define product prices
		        double coffeePrice = 3.50;
		        double cappuccinoPrice = 4.25;
		        double greenTeaPrice = 2.75;

		        // Define quantities ordered
		        int coffeeQuantity = 3;
		        int cappuccinoQuantity = 4;
		        int greenTeaQuantity = 2;

		        // Calculate subtotal
		        double subtotal = (coffeePrice * coffeeQuantity) +
		                         (cappuccinoPrice * cappuccinoQuantity) +
		                         (greenTeaPrice * greenTeaQuantity);

		        // Define sales tax rate as a constant
		        final double SALES_TAX_RATE = 0.08; // 8% sales tax

		        // Calculate total sale with sales tax
		        double salesTax = subtotal * SALES_TAX_RATE;
		        double totalSale = subtotal + salesTax;

		        // Format results to two decimal places
		        String formattedSubtotal = String.format("%.2f", subtotal);
		        String formattedSalesTax = String.format("%.2f", salesTax);
		        String formattedTotalSale = String.format("%.2f", totalSale);

		        // Print the order details
		        System.out.println("Cafe Order Details:");
		        System.out.println("Product\t\tQuantity\tPrice");
		        System.out.println("Coffee\t\t" + coffeeQuantity + "\t\t$" + coffeePrice);
		        System.out.println("Cappuccino\t" + cappuccinoQuantity + "\t\t$" + cappuccinoPrice);
		        System.out.println("Green Tea\t" + greenTeaQuantity + "\t\t$" + greenTeaPrice);
		        System.out.println("Subtotal:\t\t$" + formattedSubtotal);
		        System.out.println("Sales Tax (8%):\t$" + formattedSalesTax);
		        System.out.println("Total Sale:\t\t$" + formattedTotalSale);
		

	}
}
