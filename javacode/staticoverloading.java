package javacode;

public class staticoverloading {

		// TODO Auto-generated method stub
		static void add(int a, int b) {
	        int sum = a + b;  // Sum the two input integers
	        System.out.println("Sum of integers is: " + sum);
	    }

	    // Method to add two doubles
	    static void add(double c, double d) {
	        double sum = c + d;  // Sum the two input doubles
	        System.out.println("Sum of doubles is: " + sum);
	    }

	    // Method to concatenate two strings (similar to addition)
	    static void add(String a, String b) {
	        String sum = a + b;  // Concatenate the two input strings
	        System.out.println("Concatenation of strings is: " + sum);
	    }

	    public static void main(String[] args) {
	        // Demonstrating method overloading with different types of inputs

	        // Passing two integers to the add method
	        add(10, 20);  // Outputs: Sum of integers is: 30

	        // Passing two doubles to the add method
	        add(99.8, 88.8);  // Outputs: Sum of doubles is: 188.6

	        // Passing two strings to the add method
	        add("Abhishek", " Singh");  // Outputs: Concatenation of strings is: Abhishek Singh
	    }
	

	}


