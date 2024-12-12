package time;

import java.util.HashMap;
import java.util.Map;

public class EnumerationExample1 {

	public static void main(String[] args) {
		Map<String, Character> m1 = new HashMap<String, Character>();
		m1.put("anil", 'm');
		m1.put("abhishek", 'm');
		m1.put("singh", 'm');
		System.out.println(m1);
		for(Character m2:m1.values())
		{
			System.out.println(m2);
		}
		//System.out.println(m1.values());
	}

}
