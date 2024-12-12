/*
 * Assignment 76
 * Write a program to demonstrate the concept of compile time polymorphism
 * 
 */
package practice;

public class Assignment76 {

	static int add(int a, int b) {
		return a + b; // Return the sum of a and b
	}

	static double add1(double c, double d) {
		return c + d;
	}

	public static void main(String[] args) {

	
		int intSum = add(1, 2);
		System.out.println("Sum of integers: " + intSum);

		double doubleSum = add1(3.13, 3.23);
		System.out.println("Sum of doubles: " + doubleSum);
	}
}