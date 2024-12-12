package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> i2 = new ArrayList<Integer>();
		i2.add(23);
		i2.add(33);
		i2.add(45);
		i2.add(null);	
		i2.add(67);
		System.out.println(i2); // Print the list

		// Create an Iterator for the List
		Iterator<Integer> i1 = i2.iterator();

		// Iterate through the List using the Iterator
		while (i1.hasNext()) {
			System.out.println(i1.next()); // Print each element
		}
	}
}