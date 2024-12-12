package collection;

import java.util.Enumeration;
import java.util.Vector;

public class Vector_Class_Properties {

	public static void main(String[] args) {

		Vector v1 = new Vector();
		v1.add("sam");
		v1.add("java");
		v1.add("javascript");
		v1.add("c++");
		System.out.println(v1);

		Enumeration e1 = v1.elements();
		while (e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
		}

	}

}
