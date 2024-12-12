package practicepackage;

public class ThisAssignment {

	ThisAssignment(String name) {
		this(98768);
		System.out.println("Employee name is Abhishek");
	}

	ThisAssignment(int id) {
		this("Nagarro", "Senior Automation Tester");
		System.out.println("Employee id is 10223");
	}

	ThisAssignment(String company, String designation) {
		this(9.25);
		System.out.println("Company name is blackrock and Designation is Senior SDET");
	}

	ThisAssignment(double d) {
		System.out.println("Salary is 800000");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new ThisAssignment("Abhishek");

	}

}
