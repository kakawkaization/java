package p2_241;

class OtherPackage {
    OtherPackage() {
        p1_240.Protection p = new p1_240.Protection();
        System.out.println("constructor from other package");

        // available only for this class or package
        // System.out.println("n = " + p.n);

        // available only for this class
        // System.out.println("n_pri = " + p.n_pri);

        // available only for this class, subclass or package
        // System.out.println("n_pro = " + p.pro);

        System.out.println("n_pub = " + p.n_pub);
    }
}
