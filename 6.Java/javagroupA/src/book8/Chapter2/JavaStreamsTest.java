package book8.Chapter2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaStreamsTest {
    public static void main(String[] args) {
        try {
            File f = new File("C:\\Users\\Bianca\\Documents\\Bootcamp\\6.JavaBeginner\\javagroupA\\src\\book8\\chapter2\\movies.txt");
            BufferedReader in = new BufferedReader(new FileReader(f));
            String line = in.readLine();
            while (line != null) {
                System.out.println(line);
                line = in.readLine();
            }
        }catch (Exception e) {
            System.out.println("Error " + e);
        }
    }
}
