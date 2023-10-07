package variables;

public class StringLiterals {
		public static void main(String[] args) {
			// the most important ones are; \n, \t and \"
			
			// this is an example of the tab escape character
			System.out.println("This is a tab character ->\t<-");
			
			// Basic formating with tabs 
			System.out.println("1\tOne\tCol3");
			System.out.println("10\tTen\tCol3");
			System.out.println("100\tOne Hundred\tCol3");
			
			// This one is long so it only needs 1 tab for the 3rd column
			System.out.println("100\tOne Hundred\tCol3");
			
			
			// This is an example of a new line character \n 
			System.out.println("This is line 1\nThis is line 2\nThis is line 3");
			
			// what happens if we want to print  a \?
			System.out.println("To get a slash to print we need two of them\\");
		}
		
}
