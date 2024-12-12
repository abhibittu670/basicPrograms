package abstractinterface;

interface LoginApi {
	void address();
	// void logout();
}

public class Exapmple2 implements LoginApi {

	public void pincode() {
		System.out.println("My Pincode is 11111");

	}

	public void address() {
		// TODO Auto-generated method stub
		System.out.println("My address is delhi");
	}

	public static void main(String[] args) {

		Exapmple2 a1 = new Exapmple2();
		a1.pincode();
		a1.address();
		
	}
}