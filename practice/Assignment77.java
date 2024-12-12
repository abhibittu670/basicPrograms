package practice;

import SIBIIB.SIBClass;

public class Assignment77 {
	public static void main(String[] args) {
		SIBClass s1 = new SIBClass();
		System.out.println("Main method");
	}

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
	{
		System.out.println("IIB 3");
	}

}
