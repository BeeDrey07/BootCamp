package book2.chapter8;

public class MyException {
    public static void main(String[] args) {
        try {
            doSomething(true);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void doSomething(boolean t)
            throws Exception {
        int maxSize = 64;
        int fileSize = 120;
        if (fileSize > maxSize)
            throw new Exception("File exceeds maximum size.");
    }
}