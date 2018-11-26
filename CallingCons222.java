class A {
	A() {
		System.out.println("In constructor A.");
	}
}

class B extends A {
	B() {
		System.out.println("In constructor B.");
	}
}

class C extends B {
	C() {
		System.out.println("In constructor C.");
	}
}

class CallingCons222 {
	public static void main(String args[]) {
		C c = new C();
	}
}