package exceptionhandling;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		try {
			int c = 1/ 0;
			System.out.println("output is " + c);

		} catch (ArithmeticException e1) {

			System.out.println("Exception handled");
		}
		finally {
			System.out.println("This is my Finally block");
		}

	}

}
