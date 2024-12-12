/*Assignment 29
 * Write a program for the given strings, to check if the both arrays are equal to each other. 
 *here, String1: "kv no2 bangalore"
 *String2: "karnataka"
 */
package practice;

import java.util.Arrays;

public class Assignment29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "kv no2 bangalore";
		String s2 = "karnataka";

		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();

		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));

		if (Arrays.equals(c1, c2)) {
			System.out.println("Both strings are equal");
		}

		else {
			System.out.println("Both strings are not equal");
		}
	}

}