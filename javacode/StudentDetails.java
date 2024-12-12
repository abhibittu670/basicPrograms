package javacode;

import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the name of student");
		String name = s1.next();
		System.out.println("Enter student ID");
		int StudentID = s1.nextInt();
		System.out.println("Enter college name");
		String collegename = s1.next();
		System.out.println("Enter branch name");
		String Branchname = s1.next();
		System.out.println("Enter phone number");
		long phonenumber = s1.nextLong();
		s1.close();
	}

}
