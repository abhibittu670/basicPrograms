package collection;

import java.util.ArrayList;
import java.util.List;

public class ListProperty {

	public static void main(String[] args) {
		
		List a1 = new ArrayList();
		a1.add("Ram");
		a1.add("Laxman");
		a1.add("harry");
		a1.add("Sandhu");
		a1.add("Sandhu");
		System.out.println("Original order -->" + a1);
		System.out.println("Reversed order -->" +a1.reversed());
		
		
	}
}
