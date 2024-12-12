/*
 * Write a program to check if the two given strings are Anagrams in JAVA?
 * String 1 ="listen"
 *String 2 ="silent"  
 */
package practice;

import java.util.Arrays;

public class Assignment31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "listen";
		String s2 = "silent";

		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));

		if (Arrays.equals(c1, c2)) {
			System.out.println("Given string is Anagram");
		}

		else {
			System.out.println("String is not anagram");
		}
	}

}
