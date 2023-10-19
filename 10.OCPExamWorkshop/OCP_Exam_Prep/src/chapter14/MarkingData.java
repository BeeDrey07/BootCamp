package chapter14;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MarkingData {
    public static void main(String[] args) throws Exception {
        BufferedInputStream reader = new BufferedInputStream(new FileInputStream("C:\\data\\tiger.txt"));
        readData(reader);
    }

    public static void readData(InputStream is) throws IOException {
//        System.out.print((char) is.read()); // L
        if (is.markSupported()) {
//            is.mark(100); // Marks up to 100 bytes
//            System.out.print((char) is.read()); // I
//            System.out.print((char) is.read()); // O
//            is.reset(); // Resets stream to position before I
            System.out.print ((char)is.read()); // T
            is.skip(2); // Skips I and G
            is.read(); // Reads E but doesn't output it
            System.out.print((char)is.read()); // R
            System.out.print((char)is.read()); // S
        }
//        System.out.print((char) is.read()); // I
//        System.out.print((char) is.read()); // O
//        System.out.print((char) is.read()); // N
    }
}
