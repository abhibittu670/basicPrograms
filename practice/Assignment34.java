package practice;
/* Assignment 34 
*Write a program for the below.The given String= "myJava"
*
*i)check if the given string is consists of the exact 6 letters?
*ii)check if the String starts with 'm' ?
*iii)check if the String ends with 'y' ?
* 
*/

public class Assignment34 {

	public static void main(String[] args) {
		
		String s1 = "myJava";
		System.out.println("Lenth of the string is " + s1.length());
        //check if the String starts with 'm' ?
		System.out.println(s1.matches("m(.*)"));
		//check if the String ends with 'y' ?
		System.out.println(s1.matches("(.*)y"));
		}
	}


