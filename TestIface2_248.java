interface Callback {
    void callback(int param);
}

class Client implements Callback {
    public void callback(int p) {
        System.out.println("Method callback() called with value " + p);
    }

    void nonIfaceMath() {
        System.out.println("In classes that implements interfaces, " +
                "other members can be defined.");
    }
}

class AnotherClient implements Callback {
    public void callback(int p) {
        System.out.println("Another variant of method callback()");
        System.out.println("p squared equals " + (p * p));
    }
}

class TestIface2_248 {
    public static void main(String args[]) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();

        c.callback(42);

        c = ob;

        c.callback(42);
    }
}