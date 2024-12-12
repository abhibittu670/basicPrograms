package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.ca
		//way to iterate using for each loop
		for(Integer a1:list) {
			System.out.println("for each element is " + a1);
		}
      //way to iterate
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println("iterator" + it.next());
		}
	}

}
