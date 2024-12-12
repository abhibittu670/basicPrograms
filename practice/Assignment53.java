/*
 *Assignment 53
 *Write a program to demonstrate the properties of Vector class and also use some of the vector functions like 
 *addElements, firstElement, lastElement, removeElement, removeElementAt, removeAllElement & capacity
 */
package practice;

import java.util.Enumeration;
import java.util.Vector;

public class Assignment53 {

	public static void main(String[] args) {
		Vector<String> v1 = new Vector<>();
        v1.add("Cobol");
        v1.add("Java");
        v1.add("JavaScript");
        v1.add("C++");
        System.out.println("Initial data: " + v1);

        // Add an element at a specific position
        v1.add(2, "Python");
        System.out.println("After adding 'Python' at index 2: " + v1);

        // Retrieve the first and last elements
        System.out.println("First Element: " + v1.firstElement());
        System.out.println("Last Element: " + v1.lastElement());

        // Remove a specific element
        v1.removeElement("Java");
        System.out.println("After removing 'Java': " + v1);

        // Remove an element at a specific index
        v1.removeElementAt(2);
        System.out.println("After removing element at index 2: " + v1);

        // Display the capacity of the Vector
        System.out.println("Capacity of Vector: " + v1.capacity());

        // Remove all elements from the Vector
        v1.removeAllElements();
        System.out.println("After removing all elements: " + v1);

        // Add new elements to demonstrate Enumeration
        v1.add("HTML");
        v1.add("CSS");
        v1.add("SQL");

        // Enumerate through the elements
        Enumeration<String> e1 = v1.elements();
        System.out.println("Elements using Enumeration:");
        while (e1.hasMoreElements()) {
            System.out.println(e1.nextElement());
        }
    }
}