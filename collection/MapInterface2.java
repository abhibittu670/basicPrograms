package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterface2 {

    public static void main(String[] args) {
        // Creating a HashMap with String as the key and Character as the value
        Map<String, Character> m1 = new HashMap<String, Character>();
        
        // Adding key-value pairs to the map
        m1.put("Anil", 'M');
        m1.put("Shiva", 'M');  // Removed extra comma
        m1.put("Anita", 'F');
        m1.put("Sanjeev", 'M');
        
        
        // Printing the map
        System.out.println("Map contents: " + m1);
        
        // Iterating using entrySet() and printing each key-value pair
        System.out.println("Iterating using entrySet():");
        for (Entry<String, Character> s1 : m1.entrySet()) {
            System.out.println(s1.getKey() + " -> " + s1.getValue());
        }
        
        // Using Iterator to iterate over the entries
        Set<Entry<String, Character>> s2 = m1.entrySet();
        Iterator<Entry<String, Character>> i2 = s2.iterator();
        
        System.out.println("Iterating using Iterator:");
        while (i2.hasNext()) {
            Entry<String, Character> entry = i2.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
