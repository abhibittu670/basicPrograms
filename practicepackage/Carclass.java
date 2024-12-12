package practicepackage;

class Vehicleclass {

	void vehicle() {
		System.out.println("My Vehicle");
	}
}

public class Carclass extends Vehicleclass {
	void vehicle() {
		super.vehicle();
		System.out.println("I have Mercedes");
	}

	public static void main(String[] args) {

		Carclass T1 = new Carclass();
		T1.vehicle();
	}

}
