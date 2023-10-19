package chapter14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class Nio2FileTest {
    public static void main(String[] args) throws Exception {
        Path in = Paths.get("C:\\data\\zoo.txt");
        Path out = Paths.get("C:\\data\\zoo2.txt");
        Path out2 = Paths.get("C:\\data\\zoo3.txt");
        Path out3 = Paths.get("C:\\data\\zoo4.txt");
        Path shark = Paths.get("C:\\data\\sharks.log");
        try {
            Nio2FileTest n = new Nio2FileTest();
            n.copyPathAsString(in, out);
            n.copyPathAsString(out, out2);
            n.copyPathAsString(out2, out3);
            n.readLazily(shark);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private void copyPathAsString(Path input, Path output) throws IOException {
        String string = Files.readString(input);
        Files.writeString(output, string);
    }

    private void copyPathAsBytes(Path input, Path output) throws IOException {
        byte[] bytes = Files.readAllBytes(input);
        Files.write(output, bytes);
    }

    private void copyPathAsLines(Path input, Path output) throws IOException {
        List<String> lines = Files.readAllLines(input);
        Files.write(output, lines);
    }

    private void readLazily(Path path) throws IOException {
        try (var s = Files.lines(path)) {
            s.filter(f -> f.startsWith("WARN:"))
                    .map(f -> f.substring(5))
                    .forEach(System.out::println);
        }
    }
}

