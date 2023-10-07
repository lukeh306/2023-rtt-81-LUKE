package array;

public class ArrayDemo4 {
	 public static void main(String[] args) {

	   int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
	   int sum = 0;
	   Double average;
	   
	   // access all elements using for each loop
	   // add each element in sum
	   for (int number: numbers) {
	     sum += number;
	   }
	   int arrayLength = numbers.length;
	   
	   average = ((double)sum / (double)arrayLength);
	   
	   System.out.println("Sum = " + sum);
	   System.out.println("Average = " + average);
	   
	   
	   
	   
	   
	   
	   
	   
	   
	 }} 