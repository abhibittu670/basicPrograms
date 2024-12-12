package practice;
/*Assignment 33
 *Write a program for the below.here, String input= "Hello! 123Bye 789 "

 *i) Replace all numeric characters in a given string with an empty string ("").
 *ii)Replace all capital letters in a given string with an empty string ("").
 *iii)Replace all lower letters in a given string with an empty string ("").
 *iv)Replace the letter 'e' with 'y' 
 */
public class Assignment33 {

	public static void main(String[] args) {
		
      String s1 = "Hello! 123Bye 789 ";
      
      //Replace all numeric characters in a given string with an empty string ("").
      System.out.println(s1.replaceAll("[0-9]", ""));
      //Replace all capital letters in a given string with an empty string ("").
      System.out.println(s1.replaceAll("[A-Z]", ""));
      //Replace all lower letters in a given string with an empty string ("").
      System.out.println(s1.replaceAll("[a-z]", ""));
      //Replace the letter 'e' with 'y'
      System.out.println(s1.replace('e', 'y'));
	}

}
