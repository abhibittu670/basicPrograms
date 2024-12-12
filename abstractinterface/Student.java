package abstractinterface;

abstract class Studentdetails {

	public abstract void name(); // Abstract method 1

	public abstract void rollno(); // Abstract method 2

	public void batch() // Concrete method 1
	{
		System.out.println("Student A is from Computer Science batch");
	}

	public void address() // Concrete method 2
	{
		System.out.println("He resides in Noida Phase-2");
	}
}

class Details extends Studentdetails {

	public void name() {
		System.out.println("Student's name is Abhishek");
	}

	public void rollno() {
		System.out.println("Student's roll number is 11001");
	}

}

public class Student {
	public static void main(String[] args) {

		Details d1 = new Details();

		d1.name();
		d1.rollno();
		d1.batch();
		d1.address();
	}
}