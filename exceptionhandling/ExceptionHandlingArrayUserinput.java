package exceptionhandling;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingArrayUserinput {

	public static void main(String[] args) {
		try {

			Scanner s1 = new Scanner(System.in);
			System.out.println("Please enter the size of your array");
			int rollno[] = new int[s1.nextInt()];
			System.out.println("Please enter the values of your array");
			for (int i = 0; i < rollno.length; i++)
				rollno[0] = s1.nextInt();
			System.out.println(Arrays.toString(rollno));

		} catch (NegativeArraySizeException e) {

			System.out.println("Exception handled please enter size in postive");

		}

		catch (InputMismatchException e2) {

			System.out.println("Exception handled please Enter only numeric value");

		}

	}

}
