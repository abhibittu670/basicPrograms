package javacode;

import java.util.Scanner;

public class Assert {

	public static void main(String[] args) {

			Scanner a1 = new Scanner(System.in);
			System.out.println("Enter your age");
			int age = a1.nextInt();
			assert age >= 0 && age <= 65;
			System.out.println("Age is within the valid range (0 to 65)");
		a1.close();

	}
}
