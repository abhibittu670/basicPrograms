package abstractinterface;

import java.util.Arrays;

public class PresencePractice {

public static void main(String[] args) {
        
        int a1[] = {1, 2, 3, 4, 5, 6};
        int numbertocheck = 4;
        System.out.println("Array: " + Arrays.toString(a1));
        
        boolean found = false; // Variable to track if the number is found
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] == numbertocheck) {
                System.out.println("Number present in the array at index: " + i);
                found = true; // Set found to true
                break; // Exit the loop since the number is found
            }
        }
        
        if (!found) { // If the number is not found after the loop
            System.out.println("Number not found in the array.");
        }
    }
}