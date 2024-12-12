package javacode;

public class Inheritance {

	static void add() {
		int a = 5;
		int b = 10;
		int sum = a + b;
		System.out.println("sum of a + b is " + sum);
	}

	static void sub() {
		int a = 15;
		int b = 10;
		int sub = a - b;
		System.out.println("sub of a - b is " + sub);
	}

	public class ChildClass extends Inheritance {

		static void mul() {
			int a = 5;
			int b = 10;
			int mul = a * b;
			System.out.println("sum of a + b is " + mul);
		}

		static void div() {
			int a = 5;
			int b = 10;
			int div = a / b;
			System.out.println("sum of a + b is " + div);
		}
	
	}
	public static void main(String[] args) {
	
		Inheritance.add();
		Inheritance.sub();
		ChildClass.mul();
		ChildClass.div();

	}

}
