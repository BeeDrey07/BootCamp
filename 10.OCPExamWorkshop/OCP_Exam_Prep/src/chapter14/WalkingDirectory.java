package chapter14;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WalkingDirectory {
    public static void main(String[] args) throws IOException {
        var path = Paths.get("C:/Downloads");
        WalkingDirectory w = new WalkingDirectory();
        System.out.println("*****Size " + w.getPathSize(path));
    }
    private long getSize(Path p) {
        try {
            return Files.size(p);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
    public long getPathSize(Path source) throws IOException {
        try (var s = Files.walk(source)) {
            return s.parallel()
                    .filter(p -> !Files.isDirectory(p))
                    .peek(System.out::println)
                    .mapToLong(this::getSize)
                    .sum();
        }
    }
}
