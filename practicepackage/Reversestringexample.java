package practicepackage;

import java.util.Arrays;

public class Reversestringexample {

	public static void main(String[] args) {
		
	String s1 ="listen";
	String s2 ="silent";
	
	System.out.println(s1.length());

	char c1[] =s2.toCharArray();
	char c2[] =s2.toCharArray();
	Arrays.sort(c1);
	Arrays.sort(c2);
	System.out.println(Arrays.toString(c1));
	System.out.println(Arrays.toString(c2));
	if (Arrays.equals(c1, c2))
	{
		System.out.println("given anagram is string");
	
	}
	else {
		System.out.println("Given string is not anagram");
	}
	}
	}


