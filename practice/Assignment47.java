/*
 *Assignment 47:
 *Write a program to print the list of animals using iterator and use this following functions like hasNext, Next & remove  
 */
package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Assignment47 {

	public static void main(String[] args) {
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
		animal.remove("Buffalo");
		System.out.println("After removal of animal name " + animal);

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

		}
	}
}