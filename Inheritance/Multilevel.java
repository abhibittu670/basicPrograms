package Inheritance;

class One
{
	One()
	{
		System.out.println("First class method");
	}
}

class Child extends One
{
	Child()
	{
		System.out.println("Second class method");
	}
	}

public class Multilevel extends Child
{
    Multilevel()
    {   super(); //super calling statement is used to call imediate parent class
    	System.out.println("My constructor");
    }
	public static void main(String[] args) {
		new Multilevel();

	}

}
