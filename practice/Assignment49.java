/* 
 *Assignment 49
 *Write a program to demonstrate the Map interface with the given details:
 *1.Name and Bodyweight
 *2.BankName and Bank Account ID
 *3.Firstname and Lastname
 *4.List of Household Items and their Quantities 
 */
package practice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Assignment49 {
	public static void main(String[] args) {
		// 1. Name and Bodyweight
		Map<String, Integer> Piidata = new HashMap<>();
		Piidata.put("Abhishek", 70);

		System.out.println("Name and Bodyweight:" + Piidata);
	
		// 2. BankName and Bank Account ID
		Map<String, String> bankaccount = new HashMap<>();
		bankaccount.put("HDFC", "HDFC9876543");
		
		for (Map.Entry<String, String> entry : bankaccount.entrySet()) {
			System.out.println("Bank: " + entry.getKey()); 
			System.out.println("Account ID: " + entry.getValue());
		}
		

		// 3. Firstname and Lastname
		Map<String, String> firstlastname = new HashMap<>();
		firstlastname.put("Abhishek", "Singh");
		for (Map.Entry<String, String> entry : firstlastname.entrySet()) {
			System.out.println("Firstname " + entry.getKey());
			System.out.println("Lastname " + entry.getValue());
		}

		// 4. List of Household Items and their Quantities
		Map<String, Integer> householdItems = new HashMap<>();
		householdItems.put("Fridge", 1); 
		householdItems.put("Oven", 1); 
		householdItems.put("Geyser", 1);

		System.out.println("Household items");
		for (Map.Entry<String, Integer> entry : householdItems.entrySet()) {
			System.out.println("Item: " + entry.getKey());
			System.out.println("Quantity" + + entry.getValue());
		}
	}
}