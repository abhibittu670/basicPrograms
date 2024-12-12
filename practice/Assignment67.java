/*
 * Assignment 67
 * Write a array program to find average value from given array values
 */

package practice;

public class Assignment67 {

	public static void main(String[] args) {

		double salary[] = new double[4];
		salary[0] = 87;
		salary[1] = 95;
		salary[2] = 65;
		salary[3] = 74;
		double sum = 0;
		double average = 0;

		for (int i = 0; i < salary.length; i++) {
			sum = sum + salary[i];
		}
		System.out.println("Total sum " +sum);
		average = sum / (salary.length);
		System.out.println("Total average is " +average);

	}
}