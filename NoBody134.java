class NoBody134 {
	public static void main(String argsp[]) {
		int i, j;

		i = 100;
		j = 200;

		while(++i < --j) ;

		System.out.println("Middle value equal " + i);
	}
}