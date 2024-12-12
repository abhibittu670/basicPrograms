package practice;
/*Assigment 25.Write a java program on String functions for the following :Here, the String = " I Love MySelf"
 *a)Find the length of the given String.
 *b)Convert the String to upper case and lower case.
 *c)Remove all white spaces from String.
 *d)Reverse the given string using loops.
 * to access the superclass method in overridden methods.
 * 
 * @author--@@abhishek
*/
public class Stringmethod {

	public static void main(String[] args) {

		String s = " I Love MySelf ";
		String reverse = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			char c1 = s.charAt(i);
			reverse = reverse + c1;
		}
		System.out.println("My reversed string = " + reverse);
		System.out.println("My string length is = " + s.length());
		System.out.println("My uppercase string is = " + s.toUpperCase());
		System.out.println("My lowercase string is = " + s.toLowerCase());
		System.out.println("My trimmed string is = " + s.trim());

	}

}
