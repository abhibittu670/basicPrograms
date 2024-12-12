package practice;
/*
 *Assignment 44
 *Write a Java program to create an array of integers and populate it with values entered by the user using scanner class  
 */

import java.util.Scanner;

public class Assignment44 {

	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);
		System.out.print("Please enter the size of an array");
		int size[] = new int[s1.nextInt()];
		System.out.println("Enter your array");
		for (int i = 0; i < size.length; i++) {
			size[i] = s1.nextInt();
		}

		s1.close();
	}
}
