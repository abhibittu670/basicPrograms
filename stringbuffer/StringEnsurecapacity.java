package stringbuffer;

public class StringEnsurecapacity {

	public static void main(String[] args) {
		 
		        StringBuffer a1 = new StringBuffer("automation testing");

		        // Display the initial capacity
		        System.out.println("Initial capacity: " + a1.capacity());

		        // Ensure a minimum capacity of 50
		        a1.ensureCapacity(50);

		        // Display the capacity after ensuring
		        System.out.println("Capacity after ensureCapacity(50): " + a1.capacity());
		    }
		

	}

}
