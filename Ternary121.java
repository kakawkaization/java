class Ternary121 {
	public static void main(String[] args) {
		int i, k;

		i = 10;
		k = i < 0 ? -i : i;
		System.out.print("Absolut value ");
		System.out.println(i + " = " + k);

		i = -10;
		k = i < 0 ? -i : i;
		System.out.print("Absolut value ");
		System.out.println(i + " = " + k);
	}
}