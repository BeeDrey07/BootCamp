package chapter14;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileClassTest {
    public static void main(String[] args) throws Exception {
//        File zooFile1 = new File("C:\\Users\\Bianca\\Documents\\Bootcamp\\4.React\\Chapters\\chapter1");
//        File zooFile2 = new File("C:\\Users\\Bianca\\Documents\\Bootcamp_books\\Java\\sg1");
//        File parent = new File("C:\\Users\\Bianca\\Documents\\Bootcamp\\4.React\\Chapters");
//        File zooFile3 = new File(parent, "data/stripes.txt");
//        System.out.println(zooFile1.exists());
//        System.out.println(zooFile2.exists());
//        System.out.println(zooFile3.exists());
//        System.out.println(parent);

//        Path zooPath1 = Path.of("C:\\Users\\Bianca\\Documents\\Bootcamp\\0.IntroToProgramming\\Portfolio\\Portfolio Website");
//        Path zooPath2 = Path.of("C:\\Users\\Bianca\\Documents\\Bootcamp\\1.SQL");
//        Path zooPath3 = Paths.get("C:\\Users\\Bianca\\Documents\\Bootcamp\\0.IntroToProgramming\\Portfolio\\Portfolio Website");
//        Path zooPath4 = Paths.get("C:\\Users\\Bianca\\Documents\\Bootcamp\\1.SQL");
//        System.out.println(Files.exists(zooPath1));
//        System.out.println(Files.exists(zooPath2));
//        System.out.println(zooPath3);
//        System.out.println(zooPath4);
//        io();
//        System.out.println(Path.of("/chapter5.js").getParent().normalize().toAbsolutePath());
//        Path path = Paths.get("\\Portfolio Website");
//        System.out.println("The Path Name is: " + path);
//        for(int i=0; i<path.getNameCount(); i++)
//            System.out.println(" Element " + i + " is: " + path.getName(i));
        var p = Paths.get("C:\\Users\\Bianca\\Documents\\Bootcamp");
//        System.out.println("Path is: " + p);
//        for (int i = 0; i < p.getNameCount(); i++) {
//            System.out.println(" Element " + i + " is: " + p.getName(i));
//        }
//        System.out.println();
//        System.out.println("subpath(0,3): " + p.subpath(0, 3));
//        System.out.println("subpath(1,2): " + p.subpath(1, 2));
//        System.out.println("subpath(1,3): " + p.subpath(1, 3));
//        printPathInformation(p);

//        Path path1 = Path.of("/cats/../panther");
//        Path path2 = Path.of("food");
//        System.out.println(path1.resolve(path2));

//        Path path3 = Paths.get("E:\\habitat");
//        Path path4 = Paths.get("E:\\sanctuary\\raven\\poe.txt");
//        System.out.println(path3.relativize(path4));
//        System.out.println(path4.relativize(path3));
//
//        Path path3 = Paths.get("C:\\primate\\chimpanzee");
//        Path path4 = Paths.get("D:\\storage\\bananas.txt");
//        path3.relativize(path4); // IllegalArgumentException

//        var p1 = Path.of("./armadillo/../shells.txt");
//        System.out.println(p1.normalize()); // shells.txt
//        var p2 = Path.of("/cats/../panther/food");
//        System.out.println(p2.normalize()); // /panther/food
//        var p3 = Path.of("../../fish.txt");
//        System.out.println(p3.normalize()); // ../../fish.txt

//        var p1 = Paths.get("/pony/../weather.txt");
//        var p2 = Paths.get("/weather.txt");
//        System.out.println(p1.equals(p2)); // false
//        System.out.println(p1.normalize().equals(p2.normalize())); // true

//        System.out.println(Paths.get("/zebra/food.txt").toRealPath());
//        System.out.println(Paths.get(".././food.txt").toRealPath());

        System.out.println(Paths.get("C:\\Users\\Bianca\\Desktop").toRealPath());
        System.out.println(Paths.get("C:\\Users\\Bianca\\Documents\\Bootcamp\\2.JavaScript").toRealPath());
    }

    public static void io() {
        var file = new File("C:\\data\\zoo.txt");
        if (file.exists()) {
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Is Directory: " + file.isDirectory());
            System.out.println("Parent Path: " + file.getParent());
            if (file.isFile()) {
                System.out.println("Size: " + file.length());
                System.out.println("Last Modified: " + file.lastModified());
            } else {
                for (File subfile : file.listFiles()) {
                    System.out.println(" " + subfile.getName());
                }
            }
        }
    }

    public static void printPathInformation(Path path) {
        System.out.println("Filename is: " + path.getFileName());
        System.out.println(" Root is: " + path.getRoot());
        Path currentParent = path;
        while((currentParent = currentParent.getParent()) != null)
            System.out.println(" Current parent is: " + currentParent);
        System.out.println();
    }
}





