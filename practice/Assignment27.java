package practice;

public class Assignment27 {

	public static void main(String[] args) {

		String a = "rotator";
		String s1 = "Java";
		String s2 = "java";
		String s3 = "  A very Good Morning !  ";
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
		
		System.out.println(s1.equals(s2));
		System.out.println(s3.trim());
		
	}

}
