public interface MyIF {
    int getNumber();

    default String getString() {
        return "Object of type String by default";
    }
}