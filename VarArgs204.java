class VarArgs204 {
    static void vaTest(int ... v) {
        System.out.print("Amount of arguments: " + v.length +
            " Content: ");

        for(int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        vaTest(10);
        vaTest(1, 2, 3);
        vaTest();
    }
}
