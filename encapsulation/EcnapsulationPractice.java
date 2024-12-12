package encapsulation;

public class EcnapsulationPractice {

	
		int age;
		String name;
		double salary;
		void student_details (int age, String name ,double salary)
		{
			//System.out.println("Students details");
			this.age=age;
			this.name=name;
			this.salary=salary;
			//this.global variable to local variable
			//this keyword used in nonstatic context
		}
		public static void main(String[] args)
		{
			EcnapsulationPractice t1 = new EcnapsulationPractice();
			t1.student_details(45,"ram",8754.22);
			System.out.println(t1.age);
			System.out.println(t1.name);
			System.out.println(t1.salary);
	}

}
