package Inheritance;

import java.util.Scanner;

public class Parentclass {

	void login()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Email id");
		sc.next();
		System.out.println("Enter your Password");
		sc.next();
		System.out.println("Login Successfull");
		
		sc.close();
	}
	
	
}



