package practicepackage;

public class Pallindrome {

	public static void main(String[] args) {

		String a = "Abhishek";
		String reverse = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			char c1 = a.charAt(i);
			reverse = reverse + c1;
		}

		if (a.equals(reverse)) {
			System.out.println("This is my pallindrome");
		} else {
			System.out.println("This is not pallindrome");
		}
	}

}
