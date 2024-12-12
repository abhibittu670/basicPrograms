package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIexample {

	public static void main(String[] args) {

		Set s1 = new HashSet();
		s1.add(2);
		s1.add("Ram");
		s1.add("ravi");
		s1.add(true);
		s1.add(null);
		s1.add(null);
		
		// Set store heterogeneous value
		// indexing /order of insertion not followed
		// only one null value is printed
		System.out.println(s1);

		Iterator i1 = s1.iterator();

		while (i1.hasNext()) {
			System.out.println("Print all value = " + i1.next());
		}
	}

}
