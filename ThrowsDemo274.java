class ThrowsDemo274 {
    static void throwOne() throws IllegalAccessException {
        System.out.println("At the body of method throwOne().");
        throw new IllegalAccessException("Demonstration");
    }

    public static void main(String args[]) {
        try {
            throwOne();

        } catch (IllegalAccessException e) {
            System.out.println("Intercepted exception: " + e);
        }
    }
}