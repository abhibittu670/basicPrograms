package practicepackage;
/*This method is for method overriding and super keyword mentioned in line20
 * 
 * 
 * @author--- abhishek
 */
class Parent
{
	void login()
	{
		System.out.println("Constructor 1");
	}
}

public class SuperCalling extends Parent
{

	void login()
	{
		super.login(); //this method is used to call the parent class
		System.out.println("Constructor 2");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SuperCalling a1 = new SuperCalling();
		a1.login();

	}

}
