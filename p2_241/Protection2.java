package p2_241;

class Protection2 extends p1_240.Protection {
    Protection2() {
        System.out.println("constructor inherited from other package");

        // available only for this class or package
        // System.out.println("n = " + n);

        // available only for this class
        // System.out.println("n_pri = " + n_pri);

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
