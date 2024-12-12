/*Assignment Q21.1.Write a program that demonstrate 'Methodoverriding' for 'login'functionality. 
 * Where as the three subclasses are: Admin,Teacher,Student. and 'User' is Superclass.
 * 
 * 
 * @author--- abhishek
 */
package practice;

class User {
	void login() {

		System.out.println("Enter your user credentials");
	}
}

class Admin extends User {
	void login() {
		System.out.println("Enter your Admin credentials");
	}
}

class Teacher extends User {
	void login() {
		// super.login();
		System.out.println("Enter your Teacher credentials");
	}
}

class Student extends User {
	void login() {
		super.login();
		System.out.println("Enter your students credentials");
	}
}

public class LoginFunctionality extends User {

	void login() {
		super.login();
		System.out.println("Enter your superadmin credentials");
	}

	public static void main(String[] args) {
		User a1 = new User();
		a1.login();
		Admin a2 = new Admin();
		a2.login();
		Teacher a3 = new Teacher();
		a3.login();
		Student a4 = new Student();
		a4.login();
		LoginFunctionality a5 = new LoginFunctionality();
		a5.login();

	}

}
