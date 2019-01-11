class Exc2_266 {
    public static void main(String args[]) {
        int d, a;

        try {
            d = 0;
            a = 42 / d;
            System.out.println("This is will not showing.");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero.");
        }
        System.out.println("After operator catch.");
    }
}