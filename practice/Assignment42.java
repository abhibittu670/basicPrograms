package practice;

/*
 * Assignment42
 *Create a StringBuffer object and initialize it with the string  "Hello, World!" And Append the string " How are you?" to the StringBuilder object.
 *Insert the string "Java" at index 7.
 *Delete characters from index 2 to index 5.
 *Reverse the entire string. 
 */
public class Assignment42 {

	public static void main(String[] args) {
		// Step 1: Create a StringBuffer object and initialize it
		StringBuffer s1 = new StringBuffer("Hello, World!");
		System.out.println("Original String--> " + s1);

		// Step 2: Append the string " How are you?" to the StringBuffer object
		s1.append(" How are you?");
		System.out.println("After append--> " + s1);

		// Step 3: Insert the string "Java" at index 7
		s1.insert(7, "Java");
		System.out.println("After insertion at index 7--> " + s1);

		// Step 4: Delete characters from index 2 to index 7
		s1.delete(2, 7);
		System.out.println("After deletion from index 2 to 7--> " + s1);

		// Step 5: Reverse the entire string
		s1.reverse();
		System.out.println("After reversing--> " + s1);
	}
}