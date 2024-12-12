/*
 * Assignment 35
 *i)Write a program to split the string "Java is fun" into individual words.
 *ii)Split the string "Java Python C++" using a comma.
 *iii)Split the string "Java is fun to learn" into at most 3 parts.
 *iv)Write a program to split a sentence into words, count the words, and print them.
 *   string "My name is abhishek"
 * 
 */
package practice;

import java.util.Arrays;

public class Assignment35 {
    int wordCount =0;
	public static void main(String[] args) {
	//i)Write a program to split the string "Java is fun" into individual words.
	String s1 = "Java is fun";	
	String [] a1= s1.split(" ");
	System.out.println(Arrays.toString(a1));
	//ii) Split the string "Java,Python,C++" using a comma.	
	String s2= "Java,Python,C++";
	String [] a2= s2.split(",");
	System.out.println(Arrays.toString(a2));
	//iii) Split the string "Java is fun to learn" into at most 3 parts.
	String s3= "Java is fun to learn";
	String [] a3= s3.split(" " , 3);
	System.out.println(Arrays.toString(a3));
	//iv) Write a program to split a sentence into words, count the words, and print them.
	String s4 = "My name is abhishek";
	String[] words = s4.split(" ");
	System.out.println(Arrays.toString(words));
	int wordCount = words.length;
	System.out.println("Total number of words: " + wordCount);
	}

}
