package encapsulation;

class test {

	private String emailid = "abhishek@gmai.com";

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
}
	public class encapsulationpractice {

		public static void main(String[] args) {

			test t1 = new test();

			t1.setEmailid("abhsiehk");
			System.out.println(t1.getEmailid());
		}
	}

