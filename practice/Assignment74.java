package practice;

class Amazon_Program {
	//global variable
	private String emailid = "abhishektest@gmail.com";

	public String getEmailid() {
		System.out.println("test get data");
		return emailid;
	}

	public void setEmailid(String emailid) {
		System.out.println("test set data");
		this.emailid = emailid;
	}
}

public class Assignment74 {

	public static void main(String[] args) {
		
		Amazon_Program a1 = new Amazon_Program();
		a1.setEmailid("abhishek@gmail.com");
		System.out.println(a1.getEmailid());
	}

}
