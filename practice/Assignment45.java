package practice;
/*
 * Assignment45: Write a Java program that demonstrates the use of a single try-catch block to handle potential exceptions.
 */

public class Assignment45 {

	public static void main(String[] args) {

		try {
			int a = 1;
			int b = 0;
			int c = a / b;
			System.out.println(c);

		} catch (ArithmeticException e) {
			System.out.println("Exception occured in the programme");
		}

	}
}