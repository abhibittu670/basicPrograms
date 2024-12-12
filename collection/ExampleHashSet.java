package collection;

import java.util.HashSet;
import java.util.Set;

public class ExampleHashSet {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>();
		// insertion order is not defined in set
		// duplicates elements not used in set
		set.add(34);
		set.add(67);
		set.add(23);
		set.add(89);
		set.add(35);
		System.out.println(set);
		System.out.println("Set is " + set.isEmpty());
		System.out.println(set.size());
		// remove method is used to remove any thing from set array
		set.remove(23);
		System.out.println(set);
		// remove all number from set array
		set.removeAll(set);
		System.out.println(set);
		// contains check the presence of element in the array
		System.out.println(set.contains(100));
		// isempty is used to check whether that set is empty or not
		System.out.println("Set is " + set.isEmpty());
		//set.size is used to give the size of an array
		set.clear();
		System.out.println(set);
	}

}
