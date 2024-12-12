package practice;
/*
 *Assignment41
 *Write a program to demostrate the properties of Set in Java
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Assignment41 {

	public static void main(String[] args) {
        // Create a HashSet to store heterogeneous values
        Set<Object> s1 = new HashSet<>();
        s1.add(2);          // Integer
        s1.add("Ram");      // String
        s1.add("Ravi");     // String
        s1.add(true);       // Boolean
        s1.add(null);       // Null value
        s1.add(null);       // Duplicate null

        // Display the HashSet
        System.out.println("HashSet: " + s1);

        // Iterate over the HashSet using an Iterator
        Iterator<Object> i1 = s1.iterator();
        System.out.println("\nIterating through the HashSet:");
        while (i1.hasNext()) {
            System.out.println("Value: " + i1.next());
        }
    }
}