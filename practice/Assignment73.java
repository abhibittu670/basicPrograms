package practice;

public class Assignment73 {

    // Constructor 1: Takes name as parameter
    Assignment73(String name) {
        this(98768); // Calls the second constructor
        System.out.println("Employee name is " + name);
    }

    // Constructor 2: Takes id as parameter
    Assignment73(int id) {
        this("Nagarro", "Senior Automation Tester"); // Calls the third constructor
        System.out.println("Employee id is " + id);
    }

    // Constructor 3: Takes company and designation as parameters
    Assignment73(String company, String designation) {
        this(9.25); // Calls the fourth constructor
        System.out.println("Company name is " + company + " and Designation is " + designation);
    }

    // Constructor 4: Takes salary as parameter
    Assignment73(double salary) {
        System.out.println("Salary is " + salary);
    }

    public static void main(String[] args) {
        // Create an object to demonstrate constructor chaining
        new Assignment73("Abhishek");
    }
}
