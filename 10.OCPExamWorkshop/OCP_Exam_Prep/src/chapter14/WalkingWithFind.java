package chapter14;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WalkingWithFind {
    public static void main(String[] args) throws Exception{
        Path path = Paths.get("C:\\Users\\Bianca\\Documents\\Bootcamp\\10.OCPExamWorkshop\\OCP_Exam_Prep\\src");
        long minSize = 1_000;
        try (var s = Files.find(path, 10,
                (p, a) -> a.isRegularFile()
                        && p.toString().endsWith(".java")
                        && a.size() > minSize)) {
            s.forEach(System.out::println);
        }
    }
}
