abstract class A {
    abstract void callme();

    void callmetoo() {
        System.out.println("This is a concrete method.");
    }
}

class B extends A {
    void callme() {
        System.out.println("Realisation of method callme() from class B.");
    }
}

class AbstractDemo229 {
    public static void main(String args[]) {
        B b = new B();

        b.callme();
        b.callmetoo();
    }
}