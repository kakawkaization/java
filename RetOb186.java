class Test {
	int a;

	Test(int i) {
		a = i;
	}

	Test incrByTen() {
		Test temp = new Test(a + 10);
		return temp;
	}
}

class RetOb186 {
	public static void main(String args[]) {
		Test ob1 = new Test(2);
		Test ob2;
	}
}