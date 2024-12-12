package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MapINterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1 = new ArrayList<String>();
		l1.add("ram");
		l1.add("ravi");
		l1.add("ramesh");
		l1.add("shivam");
		l1.add("kavita");
	
		Collections.sort(l1);
		System.out.println(l1);
		boolean b1 = l1.isEmpty();
		System.out.println(b1);
		boolean b2 = l1.contains("ravi");
		System.out.println(b2);
          l1.clear();
          System.out.println(l1 );
	}

}
