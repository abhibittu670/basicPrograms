/*Assignment59
 * Write a program to iterate Map interface using for each loop for Values
 * 
 */
package practice;

import java.util.HashMap;
import java.util.Map;

public class Assignment59 {

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
		        
		        // Iterating over the values using a for-each loop
		        System.out.println("Iterating over values:");
		        for (Character value : m1.values()) {
		            System.out.println(value);
		        }
		    }
		}