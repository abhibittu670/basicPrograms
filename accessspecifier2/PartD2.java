package accessspecifier2;

public class PartD2 {
	public static void add() {
		System.out.println("My public accessfier");

	}

	private static void sub() {
		System.out.println("My private accessfier");
	}

	static void mul() {
		System.out.println("My default accessfier");
	}

	protected static void div() {
		System.out.println("My protected accessfier");
	}

	public static void main(String[] args) {
		add();
		sub();
		mul();
		div();

	}

}