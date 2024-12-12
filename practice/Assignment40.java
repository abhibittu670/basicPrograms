package practice;
/*
 * Assignment 40
 * Write a program to print the list of animals using  iterator and listiterator
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Assignment40 {

	public static void main(String[] args) {
		// Create a List and add elements
		List<String> animal = new ArrayList<>();
		animal.add("Dog");
		animal.add("Cow");
		animal.add("Cat");
		animal.add("Horse");
		animal.add("Buffalo");
		animal.add(null);
		animal.add(null);

		// Print the list
		System.out.println("Original List: " + animal);

		// Create an Iterator for the List
		Iterator<String> iterator = animal.iterator();

		// Iterate through the List using the Iterator
		System.out.println("Iterating through the List:");
		while (iterator.hasNext()) {
			String element = iterator.next();
			if (element == null) {
				System.out.println("null"); // Handle null explicitly
			} else {
				System.out.println(element);
			}
			System.out.println(animal.remove("Dog"));
			System.out.println(animal);
		}
	}
}
