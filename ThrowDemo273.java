class ThrowDemo273 {
    static void demoproc() {
        try {
            throw new NullPointerException("demonstration");
        } catch (NullPointerException e) {
            System.out.println("An exception intercepted in the body of demoproc method.");
            throw e;
        }
    }

    public static void main(String args[]) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Re-interception" + e);
        }
    }
}