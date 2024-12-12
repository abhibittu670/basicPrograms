/*Assignment 30)	
 * Write a prog to find the below from the given string: " Hello! 123@ jAvA_"
 *a)Number of alphabets used?
 *b)Number of numeric used?
 *c)Specail characters used?
 *d)Spaces used?	  
 */
package practice;

import java.util.Arrays;

public class Assignment30 {

	static int countofalphabet = 0;
	static int countofdigit = 0;
	static int countofspace = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = " Hello! 123@ jAvA_";


			char[] c1 = input.toCharArray();
			System.out.println(Arrays.toString(c1));

			for (int i = 0; i < c1.length; i++) {
				boolean b1 = Character.isAlphabetic(c1[i]);
				if (b1 == true) {
					countofalphabet++;
				}
				boolean b2 = Character.isDigit(c1[i]);
				if (b2 == true) {
					countofdigit++;
				}

				boolean b3 = Character.isWhitespace(c1[i]);
				if (b3 == true) {
					countofspace++;
				}
			}
			System.out.println("The count of alphabet in given string is " + countofalphabet);
			System.out.println("The count of digit in given string is " + countofdigit);
			System.out.println("The count of whitesp in given string is " + countofspace);

			int countofSpecialcharacters = c1.length - (countofspace + countofdigit + countofalphabet);
			System.out.println("The count of special character will be " + countofSpecialcharacters);

		}

	}
