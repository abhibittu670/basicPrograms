package javacode;

public class SingleInheritance {

	void add() {
		int a = 10;
		int b = 10;
		int sum = a + b;
		System.out.println("sum of 1st Non-static method " + sum);
	}

	void sub(int a, int b) {

		int sub = a - b;
		System.out.println("sub of 2nd Non-static method " + sub);
	}

	public static class ChildClass extends SingleInheritance {

		static void mul(int a, int b) {

			int mul = a * b;
			System.out.println("Multiplication of 1st static method " + mul);
		}

		void div(float a, int b) {
			float div = a / b;
			System.out.println("Division of 3rd non static method " + div);
		}}

		public class ThridClass extends ChildClass {

			static void toalsum(int a, int b, int c, int d) {
				int totalsum = a + b + c + d;
				System.out.println("Total sum of second static method " + totalsum);
			}

		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			SingleInheritance a1 = new SingleInheritance();
			a1.add();
		//	SingleInheritance a2 = new SingleInheritance();
			a1.sub(20, 10);
			ChildClass.mul(10, 10);
			ChildClass a3 = new ChildClass();
			a3.div(53.2f, 22);
			ThridClass.toalsum(10, 10, 20, 30);
		

	}
}
