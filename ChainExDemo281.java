class ChainExDemo281 {
    static void demoproc() {
        NullPointerException e =
                new NullPointerException("upper level");

        e.initCause(new ArithmeticException("reason"));
        throw e;
    }

    public static void main(String args[]) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Intercepted exception: " + e);

            System.out.println("Root cause: " + e.getCause());
        }
    }
}