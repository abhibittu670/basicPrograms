package javacode;

public class StaticMethod {

	static void add() {
		System.out.println("First Static Method");

	}

	static void add(int a) {
		System.out.println("Second static Mehthod");

	}

	static void add(int a, double b) {
		System.out.println("Third Static method");

	}

	public static void main(String[] args) {

		add();
		add(1);
		add(1, 3.14);

	}

}
