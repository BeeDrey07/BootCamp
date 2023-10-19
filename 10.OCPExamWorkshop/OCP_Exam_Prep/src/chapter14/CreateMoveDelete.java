package chapter14;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CreateMoveDelete {
    public static void main(String[] args) throws IOException {
//        Files.createDirectory(Path.of("\\sLink3"));
//        Files.createDirectories(Path.of("\\sLink4\\newDir"));
//        Files.copy(Paths.get("C:\\data\\zoo.txt"),
//                Paths.get("C:\\Users\\Bianca\\Desktop\\zoo.txt"));
//        Files.copy(Paths.get("C:\\data\\zoo.txt"), Paths.get("C:\\Users\\Bianca\\Desktop\\zoo.txt"),
//                StandardCopyOption.REPLACE_EXISTING);
//        try (var is = new FileInputStream("C:\\data\\zoo.txt")) {
//            // Write I/O stream data to a file
////            Files.copy(is, Paths.get("C:\\data\\zoo3.txt"));
//            Files.copy(Paths.get("C:\\data\\zoo.txt"), System.out);
//        var file = Paths.get("C:\\data\\zoo3.txt");
//        var directory = Paths.get("C:\\data\\zooDir2");
//        Files.copy(file, directory);
//        Files.move(Path.of("C:\\Users\\Bianca\\Desktop\\zoo.txt"), Path.of("C:\\Users\\Bianca\\Desktop\\zoo\\zoo.txt"));
//        Files.delete(Paths.get("C:\\Users\\Bianca\\Desktop\\zoo\\zoo.txt"));
//        Files.deleteIfExists(Paths.get("/pigeon"));
        System.out.println(Files.isSameFile(
                Path.of("C:\\Users\\Bianca\\Desktop\\cobra"),
                Path.of("C:\\Users\\Bianca\\Desktop\\snake")));
    }
}
