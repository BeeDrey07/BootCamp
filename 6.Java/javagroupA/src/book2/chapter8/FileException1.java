package book2.chapter8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileException1 {
    public static void main(String[] args) {
        openFile("c:/text.txt");
    }

    public static void openFile(String filename) {
        try {
            FileInputStream f = new FileInputStream(filename);
        } catch (FileNotFoundException error) {
            System.out.println(error);
        }
    }
}


