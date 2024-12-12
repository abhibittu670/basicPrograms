/*
 *Assignment48: Write a program using List to reverse the given list and also to reverse the words within the list
 * o/p ex :[irawiT, ramuK, hsinaM] 
 */
package practice;

import java.util.ArrayList;
import java.util.List;

public class Assignment48 {

	 public static void main(String[] args) {
	        // Input list
	        List<String> inputList = List.of("Manish", "Kumar", "Tiwari");

	        // Reverse list and words in one step
	        List<String> outputList = new ArrayList<>();
	        for (int i = inputList.size() - 1; i >= 0; i--) {
	            outputList.add(new StringBuilder(inputList.get(i)).reverse().toString());
	        }

	        // Print the result
	        System.out.println(outputList);
	    }
	}