package practice;
/*
 * Assignment 26
 *i)Find the index of a character 'c' in a given string.
 *String a1 = "Welcome India"
 *
 *ii)Retrieve the character at index '4'in a given string.
 *String str = "Programming "
 *
 *iii)Concatenate two strings.
 *  String str1 = "Hello,"
 *   String str2 = "World"
 *       
 *iv)Extract a substring from the index '11' to the end of the string.
 *String name = "Welcome to Java Programming"

 *v)Extract a substring from index 0 to 11
 *String P1 = "Programming is fun"
 * 
 */

public class Assignment26 {

	static int countofcharacter = 0;

	public static void main(String[] args) {
		
		//i)Find the index of a character 'c' in a given string.
		// String a1 = "Welcome India"
		
		String s1 = "Welcome India";
		System.out.println("Index of character c is -> " +s1.indexOf('c'));

		// ii) Retrieve the character at index '4'in a given string.
		String s2 = "Programming ";
		System.out.println("character at index 4 is -> "+s2.charAt(4));

		// iii) Concatenate two strings.
		// String str1 = "Hello,"
		// String str2 = "World"

		String s3 = "Hello";
		String s4 = "World";
		String output = s3.concat("" ) + " " .concat(s4);
		System.out.println("concanated output is -> " +output);

		// iv) Extract a substring from the index '11' to the end of the string.*String
		// name = "Welcome to Java Programming"

		String s5 = "Welcome to Java Programming";
		System.out.println("substring from the index '11' is -> " +s5.substring(11));
		
		// v) Extract a substring from index 0 to 11
	    // String P1 = "Programming is fun"
		
		String s6 = "Programming is fun";
		System.out.println("substring from index 0 to 11 is -> " +s6.substring(0,11));

	}

	}

