package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Assignment39 {
	public static void main(String[] args) {
		// Create a collection using ArrayList
		ArrayList<String> name = new ArrayList<>();

		// Adding elements to the collection
		name.add("Abhishek");
		name.add("Abhinav");
		name.add("Sanjeev");
		name.add("Pranav");

		// Print the original collection
		System.out.println("Original Collection: " + name);

		// Removing an element from the collection
		name.remove("Pranav");
		System.out.println("After removing 'Pranav': " + name);

		// Checking if an element exists in the collection
		boolean b1 = name.contains("Raghav");
		System.out.println("Is 'Raghav' present? " + b1);

		// Iterating through the collection
		System.out.println("Iterating through the collection:");
		Iterator<String> iterator = name.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// Sorting the collection
		Collections.sort(name);
		System.out.println("After sorting: " + name);

		// Sorting the collection in reverse order
		Collections.sort(name, Collections.reverseOrder());
		System.out.println("Collection after sorting in reverse order: " + name);
	}
}
