/*
 *Assignment55 
 *Write a program to demonstrate the collections class functions like sort, max, min, reverse, shuffle, swap, rotate, frequency, disjoint & replace
 * 
 */
package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment55 {

    public static void main(String[] args) {

        // Initialize a list
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 4, 7, 9, 3, 15, 17);

        System.out.println("Original list: " + list);

        // Sort the list
        Collections.sort(list);
        System.out.println("Sorted list: " + list);

        // Find max and min
        System.out.println("Max value -->: " + Collections.max(list));
        System.out.println("Min -->: " + Collections.min(list));

        // Reverse the list
        Collections.reverse(list);
        System.out.println("Reversed list: " + list);

        // Shuffle the list
        Collections.shuffle(list);
        System.out.println("Shuffled list: " + list);

        // Swap two elements
        Collections.swap(list, 0, 3);
        System.out.println("List after swapping index 0 and 3: " + list);

        // Rotate the list
        Collections.rotate(list, 2); // Rotate by 2 positions
        System.out.println("List after rotation: " + list);

        // Frequency of an element
        int freq = Collections.frequency(list, 30);
        System.out.println("Frequency of 30: " + freq);

        // Check disjoint lists
        List<Integer> anotherList = List.of(60, 70, 80);
        boolean isDisjoint = Collections.disjoint(list, anotherList);
        System.out.println("Are the lists disjoint? " + isDisjoint);

        // Replace all occurrences of an element
        Collections.replaceAll(list, 30, 99);
        System.out.println("List after replacing 30 with 99: " + list);
    }
}