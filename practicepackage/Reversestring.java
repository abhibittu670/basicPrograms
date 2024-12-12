package practicepackage;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abhishek";
		String reverse = "";
	    for (int i=s1.length()-1;i>=0;i--)
	    {
	    	char c1 = s1.charAt(i);
	    	reverse = reverse + c1;
	    			
	    }
           System.out.println(reverse);
	}
}

