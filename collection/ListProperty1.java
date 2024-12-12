package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListProperty1 {

	public static void main(String[] args) {
		// Create a List and add elements to it
		List<String> a1 = new ArrayList<>();
		a1.add("Ram 1");
		a1.add("Laxman 2");
		a1.add("harry 3");
		a1.add("Sandhu 4");
		a1.add("Sandhu 5");

		// Print the list
		System.out.println(a1);
		System.out.println("Index at 0 " + a1.get(0));
		System.out.println("Conaitns string? " + a1.contains("Sandhu 4"));
		

		

		// Create a ListIterator for the list
		ListIterator<String> a2 = a1.listIterator();

		// Forward Iteration
		System.out.println("Forward Iteration");
		while (a2.hasNext()) { // Removed the extra semicolon
			System.out.println(a2.next());
		}

		// Backward Iteration
		System.out.println("Backward Iteration");
		while (a2.hasPrevious()) { // Removed the extra semicolon
			System.out.println(a2.previous());
		}
	}
}