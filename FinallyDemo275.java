class FinallyDemo275 {
    static void procA() {
        try {
            System.out.println("At the body of method procA()");
            throw new RuntimeException("Demonstration");
        } finally {
            System.out.println("Block of operator finally in method procA()");
        }
    }

    static void procB() {
        try {
            System.out.println("At the body of method procB()");
            return;
        } finally {
            System.out.println("Block of operator finally in method proB()");
        }
    }

    static void procC() {
        try {
            System.out.println("At the body of method procC()");
        } finally {
            System.out.println("Block of operator finally in method proC()");
        }
    }

    public static void main(String args[]) {
        try {
            procA();
        } catch (Exception e) {
            System.out.println("Exception is intercepted");
        }

        procB();
        procC();
    }
}