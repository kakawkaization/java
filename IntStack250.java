interface IntStack250 {
    void push(int item);
    int pop();

    default void clear() {
        System.out.println("Method clear() not implemented.");
    }
}