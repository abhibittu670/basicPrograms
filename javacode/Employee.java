package javacode;
public class Employee {

	Employee(String name) 
	{
		this(85);
		System.out.println("Employee name is Abhishek");
	}

	Employee(int id) 
	{
		this("Amazon","Sr Associate");
		System.out.println("Employee id is 10223");
	}

	Employee(String company, String designation)
	{
		this();
		System.out.println("Company name is Amazon and Designation is Senior SDET");
	}

	Employee() {
		System.out.println("Salary is 900000");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Employee("Abhishek");
/*		new Employee(10223);
		new Employee("Amazon", "Senior sdet");
		new Employee(900000d);
*/
	}

}
