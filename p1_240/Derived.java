package p1_240;

class Derived extends Protection{
    Derived() {
        System.out.println("constructor of subclass");
        System.out.println("n = " + n);

        // only for class
        // System.out.println("n_pri = " + n_pri);

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
