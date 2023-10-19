package chapter14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MixingNioAndIo {
    public static void main(String[] args) throws IOException {
        Path in = Paths.get("C:\\data\\zoo.txt");
        Path out = Paths.get("C:\\data\\zoo2.txt");
        copyPath(in, out);
    }

    private static void copyPath(Path input, Path output) throws IOException {
        try (var reader = Files.newBufferedReader(input);
             var writer = Files.newBufferedWriter(output)) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        }
    }
}

