class IfSample64 {
    public static void main(String args[]) {
        int x, y;

        x = 10;
        y = 20;

        if(x < y) System.out.println("x less y");

        x = x * 2;
        if(x == y) System.out.println("x equally y");

        x = x * 2;
        if(x > y) System.out.println("x more y");

        if(x == y) System.out.println("you can't see this");
    }
}
