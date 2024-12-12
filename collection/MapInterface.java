package collection;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {

	public static void main(String[] args) {
		// upcasting
		Map m1 = new HashMap();
		m1.put("Abhishek", 23);
		m1.put("Suraj", 35);
		m1.put("Sanjeev", 67);
		m1.put("King", 77);
		//indexing not followed
		//order of insertion not followed
		System.out.println(m1);
		//for removing any key
		m1.remove("King");
		//for removing any key and value pair
		m1.remove("Sanjeev", 67);
		//for replacing any value
		m1.replace("Abhishek", 45);
		System.out.println("Final output of m1 " +m1);
		
		Map<String, Integer> m2 = new HashMap<String, Integer>();
		m2.put("Ravi", 93);
		m2.put("Kavi", 55);
		m2.put("Abhi", 67);
		m2.put("Savi", 17);
		//indexing not followed
		//order of insertion not followed
		System.out.println(m2);
		//this method is used to replace old value with new 
		m2.replace("Ravi", 93, 63);
		System.out.println("Values after replacement " + m2);
		Map<String,Integer> m3 = new HashMap<String,Integer>();
		m3.putAll(m2);
		m3.put("Sachin", 99);
		m3.remove("savi");
		System.out.println(m3);
		boolean b1 = m1.equals(m3);
		System.out.println(b1);

	}

}