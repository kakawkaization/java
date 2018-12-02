class A {
    void callme() {
        System.out.println("In method callme() from class A");
    }
}

class B extends A {
    void callme() {
        System.out.println("In method callme() from class B");
    }
}

class C extends A {
    void callme() {
        System.out.println("In method callme() from class C");
    }
}

class Dispatch226 {
    public static void main(String args[]) {
        A a = new A();
        B b = new B();
        C c = new C();

        A r;

        r = a;
        r.callme();

        r = b;
        r.callme();

        r = c;
        r.callme();
    }
}