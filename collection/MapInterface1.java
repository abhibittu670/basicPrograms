package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterface1 {

    public static void main(String[] args) {

        // Creating a HashMap with String as the key and Character as the value
        Map<String, Character> ma = new HashMap<String, Character>();
        
        // Adding elements to the map
        ma.put("Sashwat", 'F');
        ma.put("Keshav", 'M');
        ma.put("Dheeraj", 'M');
        ma.put("Damodar", 'F');
        ma.put("Sashwat", 'T');  // Overwriting the value for the key "Sashwat"
        
        // Printing the map
        System.out.println(ma);
        
        // Adding a key-value pair only if the key is absent
        ma.putIfAbsent("Kishan", 'F');
        System.out.println(ma);
        
        // Printing the keys
        System.out.println(ma.keySet());
        
        // Printing the values
        System.out.println(ma.values());
        
        // Iterating over values using a for-each loop
        for (Character s1 : ma.values()) {
            System.out.println(s1);
        }

        // Iterating over keys using a for-each loop
        for (String s2 : ma.keySet()) {
            System.out.println(s2);
        }

        // Iterating over entries (key-value pairs) using entrySet()
        for (Entry<String, Character> e1 : ma.entrySet()) {
            System.out.println(e1.getKey() + " -> " + e1.getValue());
        }
        
        // Iterating over entries using Iterator
        Set<Entry<String, Character>> s8 = ma.entrySet();
        Iterator<Entry<String, Character>> i9 = s8.iterator();
        
        while(i9.hasNext()) {
            Entry<String, Character> entry = i9.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
