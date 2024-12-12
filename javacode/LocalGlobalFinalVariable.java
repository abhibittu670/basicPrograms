package javacode;

public class LocalGlobalFinalVariable {

	final static int c = 100; // c is final variable
	static int d = 200; // d is global variable
	static int sum = c + d; // sum is global variable

	static void add() {
		int a = 10; // a is local variable
		int b = 20; // b is local variable
		int sub = a - b; // sum is local variable
		System.out.println("This is subtracted value of local variable " + sub);
	}

	public static void main(String[] args) {

		add();
		System.out.println(sum);

	}

}
