package stringbuffer;

public class StringBufferPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer a1 = new StringBuffer("automation");
		a1.append(" Testing");
		System.out.println(a1);
		//insert any string at position
		System.out.println(a1.insert(11, "hello "));
		//replacing of any string at position
		System.out.println(a1.replace(11, 16, "APi"));
		System.out.println(a1);
		

	}

}
