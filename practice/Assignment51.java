/*
 * Assignment51
 * Write a program to demonstrate the following functions like 
 * append, insert, replace, delete, reverse, capacity, charAt, length, substring(int) & substring (start & end index) 
 * using StringBuffer concept
 * 
 */
package practice;

public class Assignment51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder a1 = new StringBuilder("automation testing");
		// value after append
		System.out.println("Appended string -->" + a1.append(" using selenium"));
		System.out.println("Final string -->" + a1);
		// System.out.println(a1.insert('s', 2));
		// replace
		System.out.println("Replaced value -->" + a1.replace(0, 10, "Cypress"));
		// reverse
		System.out.println("Reversed value -->" + a1.reverse());
		// capacity
		System.out.println("current capacity -->" + a1.capacity());
		// charAt
		System.out.println("character at index -->" + a1.charAt(12));
		// total length
		System.out.println("Length of the string -->" + a1.length());
		// substring(int)
		System.out.println("Substring at -->" + a1.substring(5));
		// after deletion
		System.out.println("Substring at start and end index -->" + a1.substring(0, 8));

	}

}