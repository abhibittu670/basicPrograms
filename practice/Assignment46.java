package practice;

/*
 * Assignment46: Write a Java program that demonstrates the use of a single try and multiple catch block to handle  exceptions.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment46 {

	public static void main(String[] args) {

		try {
			Scanner s1 = new Scanner(System.in);
			System.out.print("Please enter the size of an array");
			int size[] = new int[s1.nextInt()];
			System.out.println("Enter your array");
			for (int i = 0; i < size.length; i++) {
				size[i] = s1.nextInt();
			}
			s1.close();

		} catch (InputMismatchException e) {
			System.out.println("Please enter the numeric value");

		}

		catch (NegativeArraySizeException e2) {
			System.out.println("Please enter the positive value");

		}

	}

}
