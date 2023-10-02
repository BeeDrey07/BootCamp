package book2.chapter8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileException4 {
    public static void main(String[] args) {
        try {
            openFile("c:/text.txt");
        } catch (FileNotFoundException error) {

        }
    }

    public static void openFile(String file) throws FileNotFoundException {
        FileInputStream f = new FileInputStream(file);
    }
}
