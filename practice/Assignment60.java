package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Assignment60 {

	public static void main(String[] args) {
        // Creating a HashMap with String as the key and Character as the value
        Map<String, Character> m1 = new HashMap<>();
        
        // Adding key-value pairs to the map
        m1.put("Anil", 'M');
        m1.put("Shiva", 'M');
        m1.put("Anita", 'F');
        m1.put("Sanjeev", 'M');
        
        // Printing the map
        System.out.println("Map contents: " + m1);
        
        // Iterating over the entries using a for-each loop and entrySet()
        System.out.println("Iterating using entrySet:");
        for (Entry<String, Character> entry : m1.entrySet()) {
            System.out.println("Key: " + entry.getKey());
            System.out.println("value " +  entry.getValue());
        }
    }
}