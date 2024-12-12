package practice;

public class Assignment64 {

	public static void main(String[] args) {
        int number = 1; // Start with the first natural number
        int sum = 0;    // Initialize the sum to 0

        while (number <= 50) { // Loop until 50
            sum += number;    // Add the current number to the sum
            number++;         // Increment the number
        }

        System.out.println("The sum of the first 50 natural numbers is: " + sum);
    }
}