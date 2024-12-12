/*
 * Assignment56: Write a program to print the list of animals using enumeration
 * 
 */
package practice;

import java.util.Enumeration;
import java.util.Vector;

public class Assignment56 {

	public static void main(String[] args) {
		Vector<String> v1 = new Vector<>();
		v1.add("Cat");
		v1.add("Cow");
		v1.add("Horse");
		v1.add("Dog");

		// Enumerate through the elements
		Enumeration<String> e1 = v1.elements();
		System.out.println("Animals ");
		while (e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
		}
	}
}