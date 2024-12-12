/*
 * Assignment 57
 * Write a program to demonstrate the Map interface functions like 
 * put, remove, putAll, equals, replace, putIfAbsent, keySet, values, isEmpty, containsKey, containsValue, & clear
 */

package practice;

import java.util.HashMap;
import java.util.Map;

public class Assignment57 {

    public static void main(String[] args) {
        // Create and populate the first map
        Map<String, Integer> m1 = new HashMap<>();
        m1.put("Abhishek", 23);
        m1.put("Suraj", 35);
        m1.put("Sanjeev", 67);
        m1.put("King", 77);

        System.out.println("Initial m1: " + m1);

        // Demonstrate remove, replace, and putIfAbsent
        m1.remove("King");
        m1.replace("Abhishek", 45);
        m1.putIfAbsent("Rohit", 50);

        System.out.println("m1 after modifications: " + m1);

        // Display keySet, values, and check if m1 is empty
        System.out.println("Keys in m1: " + m1.keySet());
        System.out.println("Values in m1: " + m1.values());
        System.out.println("Is m1 empty? " + m1.isEmpty());

        // Create and populate the second map
        Map<String, Integer> m2 = new HashMap<>();
        m2.put("Ravi", 93);
        m2.put("Kavi", 55);
        m2.put("Abhi", 67);
        m2.put("Savi", 17);

        System.out.println("Initial m2: " + m2);

        // Replace a value in m2
        m2.replace("Ravi", 93, 63);
        System.out.println("m2 after replacement: " + m2);

        // Create a third map and demonstrate putAll
        Map<String, Integer> m3 = new HashMap<>(m2);
        m3.put("Sachin", 99);

        System.out.println("m3 after using putAll and adding 'Sachin': " + m3);

        // Check equality of m1 and m3
        boolean areEqual = m1.equals(m3);
        System.out.println("Are m1 and m3 equal? " + areEqual);

        // Clear m3 and display
        m3.clear();
        System.out.println("m3 after clear(): " + m3);
    }
}
