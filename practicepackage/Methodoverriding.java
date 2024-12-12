package practicepackage;

public class Methodoverriding {

    // Method to add two integers
    static void add(int a, int b) {
        System.out.println("Integer addition result: " + (a + b));
    }

    // Method to add a double and an integer
    static void add(double a, int b) {
        System.out.println("Double and Integer addition result: " + (a + b));
    }

    public static void main(String[] args) {
        // Call static methods using the class name
        Methodoverriding.add(23.2, 1); // Calls the overloaded method with double and int
        Methodoverriding.add(23, 1);   // Calls the overloaded method with int and int
    }
}
