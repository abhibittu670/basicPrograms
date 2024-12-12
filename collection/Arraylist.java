package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class Arraylist {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Mohit");
		list.add("Rohit");
		list.add("Zohit");
		list.add("Sohit");
		System.out.println(list);
		// this will add new string
		list.add("Shivam");
		System.out.println(list);
		// this will add new string at position 1
		list.add(1, "Sachin");
		System.out.println(list);

		List<String> newlist = new ArrayList();
		newlist.add("sonu");
		newlist.add("monu");
		newlist.add("tonu");
		// this will add all element to list array
		list.addAll(newlist);
		System.out.println(list);
		System.out.println("Element at given position is " + list.get(3));
		//this will remove the element
		list.remove(2);
		System.out.println("output after removal" + list);
		
		//This will update any element in between
		list.set(1, "Abhishek");
		System.out.println(list);
		//this will remove all element
		list.clear();
		System.out.println(list);

	}

}
