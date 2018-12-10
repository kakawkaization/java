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

class TestIface246 {
    public static void main(String args[]) {
        Callback c = new Client();
        c.callback(42);
    }
}