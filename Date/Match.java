package Date;

public class Match {

	public static void main(String[] args) {
		String a1 = "Manish Kumar Tiwari";
		boolean b1 =a1.contains("Sharma");
		System.out.println(b1);
		String a2 = "ekta";
		boolean b2 = a2.matches("....");
		System.out.println(b2);
		//check the given string starts with e
		System.out.println(a1.matches("e(.*)"));
		System.out.println(a1.matches("(.*)i"));
		System.out.println(a1.matches("(.*) Kumar (.*)"));

	}

}
