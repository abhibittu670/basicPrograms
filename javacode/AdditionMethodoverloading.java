package javacode;

public class AdditionMethodoverloading {

	static void add(int a, int b) {
		int sum = a + b;

		System.out.println("sum of a + b is " + sum);

	}

	static void add(double c, double d) {
		double sum = c + d;
		System.out.println("Addition of double is " + sum);

	}

	static void add(String a, String d) {
		String sum = a + d;
		System.out.println("Addition of string " + sum);

	}

	public static void main(String[] args) {

		add(20, 30);
		add(99.8, 88.8);
		add("abhishek" , "singh");

	}

}