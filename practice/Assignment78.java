package practice;

public class Assignment78 {

	static {
		System.out.println("SIB 1");
	}
	static {
		System.out.println("SIB 2");
	}
	{
		System.out.println("IIB 1");
	}
	{
		System.out.println("IIB 2");
	}

	// Constructor
	public Assignment78() {
		System.out.println("Constructor called");
	}

	public static void main(String[] args) {
		
		System.out.println("Creating first object");
		Assignment78 s1 = new Assignment78(); 
		System.out.println("Creating second object");
		Assignment78 s2 = new Assignment78(); 
		
	}
}
