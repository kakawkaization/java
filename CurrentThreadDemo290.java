class CurrentThreadDemo290 {
    public static void main(String args[]) {
        Thread t = Thread.currentThread();

        System.out.println("Current execution thread: " + t);

        t.setName("My thread");
        System.out.println("After change name of thread: " + t);

        try {
            for(int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main execution thread is interrupted.");
        }
    }
}