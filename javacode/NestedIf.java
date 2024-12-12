package javacode;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 17;
		int weight = 56;

		if (age >= 18) {
			if (weight >= 55) {
				System.out.println("Person eligble to donate blood");

			} else {
				System.out.println("Person not eligble to donate blood");
			}

		} else {
			System.out.println("Person not eligble to donate blood");
		}

	}

}
