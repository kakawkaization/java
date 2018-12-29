class MyIFImp implements MyIF {
    public int getNumber() {
        return 100;
    }
}

class DefaultMethodDemo257 {
    public static void main(String args[]) {
        MyIFImp obj = new MyIFImp();

        System.out.println(obj.getNumber());
        System.out.println(obj.getString());
    }
}