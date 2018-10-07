class Box {
    double width;
    double height;
    double depth;

    Box() {
        System.out.println("Construction of objext Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxDemo169_6 {
    public static void main(String args[]) {
        
