package abstractinterface;

interface ClassB {
	void Pincode();
}

interface ClassC {
	void Address();
}

public class ClassA implements ClassB, ClassC {

	public void Pincode() {
		{
			System.out.println("My pin code is 11100");
		}
	}

	public void Address() {
		{
			System.out.println("Address is delhi");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA a1 = new ClassA();
		a1.Pincode();
		a1.Address();

	}

}
