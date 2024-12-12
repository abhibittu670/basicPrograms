package encapsulation;

 class test1
 {
	 private String emailid = "abhishek@gmail.com";

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
 }

public class Encapsulationexample {

	public static void main(String[] args) {
	
    test1 a1 = new test1();
    a1.setEmailid("abhsiehksingh@gmail.com");
    System.out.println(a1.getEmailid());
	}

}
