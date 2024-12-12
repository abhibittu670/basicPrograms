
 /* to access the superclass method in overridden methods.
 * 
 * @author--@@abhishek
 */
package practice;

class Overriding{
	 void login()
	{
		System.out.println("Invoke my parent clas");
	}
}

public class Superclass extends Overriding {
	 void login()
	{  
	   // super.login(); //super.login is used to invoke parent class
		System.out.println("Invoke my child clas");
	}


	public static void main(String[] args) {
		
		Superclass a1 = new Superclass();
		a1.login();
	}

}
