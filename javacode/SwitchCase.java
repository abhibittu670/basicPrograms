package javacode;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner a1 = new Scanner(System.in);
		System.out.println("Write any value between 1 to 7");
		int day = a1.nextInt();

		switch (day) {
		case 1:
			System.out.println("First day of the week is Monday");
			break;
		case 2:
			System.out.println("Second day of the week is Tuesday");
			break;
		case 3:
			System.out.println("Third day of the week is wednesday");
			break;
		case 4:
			System.out.println("Fourth day of the week is Thursday");
			break;
		case 5:
			System.out.println("Fifth day of the week is Friday");
			break;
		case 6:
			System.out.println("Sixth day of the week is Saturday");
			break;
		case 7:
			System.out.println("Seventh day of the week is Sunday");
			break;
		default:
			System.out.println("Please enter the correct value between 1-7 to retrive the day of the week");
		}
       a1.close();
	}
}
