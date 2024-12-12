package practice;
/* Assignment 32
 *a)find the output for the given string by using 'equals()' and 'equalsIgnoreCase()' String methods?
 * Strings are Java and java
 *b)Write a program that uses the 'contains()'method in the string class to check if the substrings: "Java" and "Python" are present in the string?
 * where String name = "Java programming is awesome!" 
 */

public class Assignment32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Java programming is awesome!";
		String s2 = "Hello";
		String s3 = "hello";

		boolean b1 = s1.contains("Java");
		boolean b2 = s1.contains("Python");
		System.out.println("Check wether Java exist in given string " + b1);
		System.out.println("Check wether Python exist in given string " + b2);

		boolean output = s2.equals(s3);
		System.out.println("Using equals(): " + output); 

		boolean IgnoreCase = s2.equalsIgnoreCase(s3);
		System.out.println("Using equalsIgnoreCase(): " + IgnoreCase);

	}

}
