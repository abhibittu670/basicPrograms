package practice;

import java.util.Scanner;

public class Assignment68 {

	public static void main(String[] args) {

		// Initialize the array
		int[] arr = { 1, 2, 3, 4, 5 };

		// Get user input
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter a number to check if it is in the array: ");
		int userinput = s1.nextInt();

		// Search for the number
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == userinput) 
			{
				System.out.println("Number provided by user is present in array");
				s1.close();
				return; // Exit program since the number is found
			}
		}

		// If the number is not found
		System.out.println("Number provided by user not present in array");
		s1.close();
	}
}