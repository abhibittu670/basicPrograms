package stringbuffer;

public class StringBuffer2 {

	public static void main(String[] args) 
	{
		StringBuffer a1 = new StringBuffer("automation testing");
		System.out.println(a1.ensureCapacity(50));
		System.out.println(a1.length());
		System.out.println(a1.delete(12, 18));
		System.out.println(a1.reverse());
        System.out.println(a1.substring(5));
        System.out.println(a1.delete(0, 9));
        System.out.println(a1.charAt(2));
        a1.setLength(78);
        
	}

}
