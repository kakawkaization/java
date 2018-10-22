class Outer {
	int outer_x = 100;

	void test() {
		Inner inner = new Inner();
		inner.display();
	}

	class Inner {
		void display() {
			System.out.println("Output: outer_x = " + outer_x);
		}
	}

	void showy() {
		System.out.println(y); //error, variable y is not available!
	}
}

class InnerClassDemo198 {
	public static void main(String args[]) {
		Outer outer = new Outer();
		outer.test();
	}
}