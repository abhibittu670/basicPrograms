package abstractinterface;

import java.util.Arrays;

public class PresenceofnumberinArray {

    public static void main(String[] args) {
        // Array initialization
        int[] a1 = {74, 34, 43, 56, 54};
        
        // Number to check in the array
        int numbertocheck = 99;
        
        // Print the array
        System.out.println("Array: " + Arrays.toString(a1));
        
        // Check if the number is in the array
        boolean found = false;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] == numbertocheck) {
                System.out.println("Number present in the given array at index: " + i);
                found = true;
                break;  // Stop the loop after finding the number
            }
        }
        
        // If the number is not found
        if (!found) {
            System.out.println("Number not found in the array.");
        }
    }
}
