/*
 * Assignment 72
 *Write a program to demonstrate Finally block in exception handling
 */
package practice;

public class Assignment72 {

	public static void main(String[] args) {
		try {
			int c = 1/ 0;
			System.out.println("output is " + c);

		} catch (ArithmeticException e1) {

			System.out.println("Exception handled");
		}
		finally {
			System.out.println("This is my Finally block");
		}

	}

}
