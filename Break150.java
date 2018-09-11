class Break150 {
	public static void main(String args[]) {
		boolean t = true;

		first: {
			second: {
				third: {
					System.out.println("Before operator break.");
					if(t) break second;
						System.out.println("This operator will not be executed.");
				}
				System.out.println("This operator will not be executed.");
			}
			System.out.println("This operator follows the block second.");
		}
	}
}