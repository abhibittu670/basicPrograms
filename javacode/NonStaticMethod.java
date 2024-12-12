package javacode;

public class NonStaticMethod {

	void add(double a, int b) {

		System.out.println("First non static method");

	}

	void sub(double c, double d) {
		System.out.println("Second non static method");

	}

	public static void main(String[] args) {
		MethodOverloading a1 = new MethodOverloading();
		a1.add(3.14, 5);
		a1.sub(88.8, 88.8);

	}

}
