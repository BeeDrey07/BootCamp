package chapter11;

import java.io.FileOutputStream;
import java.util.Scanner;

public class TryWithResourcesTest {
    public static void main(String[] args) {
//        try (var in = newFileInputStream("date.'txt'");
//        var out = new FileOutputStream("output.txt"); {
//            // protected code
//        }

//        try (MyFileClass ab = new MyFileClass(1); // does not compile
//             MyFileClass cd = new MyFileClass(2)) {
//        }
//    }

//        Scanner s2 = null;
//        try (Scanner s = new Scanner(System.in)) {
//            s2 = s;
//            s.nextLine();
//        } catch (Exception e) {
//            s2.nextInt(); // DOES NOT COMPILE
//        } finally {
//            s2.nextInt(); // DOES NOT COMPILE
//            s2.nextInt(); // DOES NOT COMPILE
//        }

//        try (MyFileClass bookReader = new MyFileClass(1) ;
//            MyFileClass movieReader = new MyFileClass(2)) {
//            System.out.println("Try BLock");
//            throw new RuntimeException();
//        } catch (Exception e) {
//            System.out.println("catch block");
//        } finally {
//            System.out.println("Finally block");
//        }

//        final var bookReader = new MyFileClass(4);
//        MyFileClass movieReader = new MyFileClass(5);
//        try (bookReader;
//        var tvReader = new MyFileClass(6);
//        movieReader) {
//            System.out.println("Try block");
//        } finally {
//            System.out.println("Finally block");
//        }

        try (JammedTurkeyCage t = new JammedTurkeyCage()) {
            throw new RuntimeException("Turkeys ran off");
        } catch (IllegalStateException e) {
            System.out.println("Caught: " + e.getMessage());
        }

    }
}

class MyFileClass implements AutoCloseable {
    private final int num;

    public MyFileClass(int num) {
        this.num = num;
    }

    @Override
    public void close() {
        System.out.println("Closing: " + num);
    }
}

class JammedTurkeyCage implements AutoCloseable {
    public void close() throws IllegalStateException {
        throw new IllegalStateException("Cage door does not close");
    }
}