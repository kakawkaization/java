class Factorial {
	int fact(int n) {
		int result;

		if(n == 1) return 1;
		result = fact(n - 1) * n;
		return result;
	}
}

class Recursion187 {
	public static void main(String args[]) {
		Factorial f = new Factorial();

		System.out.println("Factorial on number 3 equal: " + f.fact(3));
		System.out.println("Factorial on number 4 equal: " + f.fact(4));
		System.out.println("Factorial on number 5 equal: " + f.fact(5));
	}
}