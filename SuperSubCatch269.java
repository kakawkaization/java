class SuperSubCatch269 {
    public static void main(String args[]) {
        try {
            int a = 0;
            int b = 42 / a;
        } catch (Exception e) {
            System.out.println("Interception of exceptions of general class Exception.");
        }

        catch (ArithmeticException e) {
            System.out.println("This code is generally unreachable.");
        }
    }
}