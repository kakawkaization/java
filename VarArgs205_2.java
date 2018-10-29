class VarArgs205_2 {
    static void vaTest(String msg, int ... v) {
        System.out.print(msg + v.length +
            " Content: ");

        for(int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        vaTest("One parameter variable length: ", 10);
        vaTest("Three parameters variable length: ", 1, 2, 3);
        vaTest("Without parameters variable length: ");
    }
}
