package practicepackage;

public class Revesrename {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String a = "My name is Abhishek";
      String reverse ="";
      
      for (int i=a.length()-1;i>=0;i--)
      {
    	  char c1 = a.charAt(i);
    	  reverse =  reverse + c1;
      }
      System.out.println(reverse);
      
      
    	//System.out.println(reverse);
	}

}
