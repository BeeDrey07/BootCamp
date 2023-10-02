package book2.chapter8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileException5 {
    public static void main(String name) {
        try {
            FileInputStream f = new FileInputStream(name);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        try {
            FileInputStream f = new FileInputStream(name);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
