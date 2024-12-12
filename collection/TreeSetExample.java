package collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Set<Integer> s1 = new TreeSet<>();
        s1.add(34);
		s1.add(67);
		s1.add(23);
		s1.add(89);
		s1.add(35);
		//store value randomly
		System.out.println(s1);
		System.out.println(s1.remove(34));
		System.out.println(s1.contains(34));
		System.out.println(s1.isEmpty());
		System.out.println(s1.size());
	}

}
