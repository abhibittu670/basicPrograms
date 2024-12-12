package javacode;

public class MethodOverloading {

	static void add() {
		System.out.println("First Static Method");

	}

	static void add(int a) {
		System.out.println("Second static Mehthod");

	}

	static void add(double d, double b) {
		System.out.println("Third Static method");

	}

	void add(double a, int b) {

		System.out.println("First non static method");

	}

	void sub(double c, double d) {
		System.out.println("Second non static method");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		add();
		add(1);
		add(1, 1.12);
		MethodOverloading a1 = new MethodOverloading();
		a1.add(3.14, 5);
		a1.sub(88.8, 88.8);
		
	}

}
