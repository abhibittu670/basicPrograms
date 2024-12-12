package abstractinterface;

abstract class Google_auth {
    // Abstract method without a body
    abstract void login();
}

public class Example extends Google_auth {
    // Concrete implementation of the abstract method
    void login() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Example a1 = new Example();
        a1.login(); // Calls the overridden method in the child class
    }
}