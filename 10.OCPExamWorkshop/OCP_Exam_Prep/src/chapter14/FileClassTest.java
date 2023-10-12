package chapter14;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileClassTest {
    public static void main(String[] args) {
//        File zooFile1 = new File("C:\\Users\\Bianca\\Documents\\Bootcamp\\4.React\\Chapters\\chapter1");
//        File zooFile2 = new File("C:\\Users\\Bianca\\Documents\\Bootcamp_books\\Java\\sg1");
//        File parent = new File("C:\\Users\\Bianca\\Documents\\Bootcamp\\4.React\\Chapters");
//        File zooFile3 = new File(parent, "data/stripes.txt");
//        System.out.println(zooFile1.exists());
//        System.out.println(zooFile2.exists());
//        System.out.println(zooFile3.exists());
//        System.out.println(parent);

        Path zooPath1 = Path.of("C:\\Users\\Bianca\\Documents\\Bootcamp\\0.IntroToProgramming\\Portfolio\\Portfolio Website");
        Path zooPath2 = Path.of("C:\\Users\\Bianca\\Documents\\Bootcamp\\1.SQL");
        Path zooPath3 = Paths.get("C:\\Users\\Bianca\\Documents\\Bootcamp\\0.IntroToProgramming\\Portfolio\\Portfolio Website");
        Path zooPath4 = Paths.get("C:\\Users\\Bianca\\Documents\\Bootcamp\\1.SQL");
        System.out.println(Files.exists(zooPath1));
        System.out.println(Files.exists(zooPath2));
        System.out.println(zooPath3);
        System.out.println(zooPath4);
    }
}
