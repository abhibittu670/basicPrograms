package collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Mapexample4 {
	
	public static void main(String[] args) {
		
		Map<String,Character> m1 = new HashMap<String, Character>();
		m1.put("Abhishek", 'M');
		m1.put("Suraj", 'F');
		m1.put("Sanjeev", 'M');
		m1.put("King", 'F');
		Collections.sort(m1);
		System.out.println(m1);
		boolean b1 = m1.isEmpty();
		System.out.println(b1);
		boolean b2 = m1.containsKey("Abhishek");
		System.out.println(b2);
		boolean b3 = m1.containsValue("F");
		System.out.println(b3);
		m1.clear();
		System.out.println(m1);
		
		
	}

}
