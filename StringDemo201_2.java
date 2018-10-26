class StringDemo201_2 {
	public static void main(String args[]) {
		String strOb1 = "First string";
		String strOb2 = "Second string";
		String strOb3 = strOb1;

		System.out.println("Length of string strOb1: " + strOb1.length());
		System.out.println("Symbol at index 3 in the string strOb2: " + strOb1.charAt(3));
		
		if(strOb1.equals(strOb2)) 
			System.out.println("strOb1 == strOb2");
		else
			System.out.println("strOb1 != strOb2");

		if(strOb1.equals(strOb3)) 
			System.out.println("strOb1 == strOb3");
		else
			System.out.println("strOb1 != strOb3");
	}
}