class MultipleCatches268 {
    public static void main(String args[]) {
        try {
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42 / a;
            int c[] = { 1 };
            c[42] = 99;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indexing error outside of array: " + e);
        }
        System.out.println("After blocks of operators try/catch ");
    }
}