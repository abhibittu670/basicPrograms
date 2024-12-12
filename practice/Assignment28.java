package practice;
/*
 * Assignment 28 
 * Write a Java program to create and display an array of boolean and double data types. 
 * Initialize the arrays with some sample values and display them in array form.
 */
public class Assignment28 {

	public static void main(String[] args) {
		
		boolean[] boolArray = {true, false, true, false, true};
        System.out.println("Boolean Array: " + java.util.Arrays.toString(boolArray));
    
        double[] doubleArray = {3.14, 2.718, 1.618, 4.67, 9.81};
        System.out.println("Double Array: " + java.util.Arrays.toString(doubleArray));
    }

	}

