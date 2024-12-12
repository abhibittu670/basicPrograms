package practice;
/*Assignment37
 * 
 * Write a program to display the time in the format : "Wed, Nov 20"
 *
 */

import java.util.Date;

public class Assignment37 {

	public static void main(String[] args) {

		Date t1 = new Date();
		System.out.println(t1);
		System.out.println(t1.getTime());
		String input = t1.toString();
		String day = input.substring(0, 3);
		System.out.println(day);
		String month = input.substring(4, 7);
		System.out.println(month);
		String year = input.substring(8, 10);
		System.out.println(year);
		System.out.println(day.concat(",").concat(month).concat(" ").concat(year));

	}

}
