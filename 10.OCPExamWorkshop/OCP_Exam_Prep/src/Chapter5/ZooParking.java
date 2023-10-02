package Chapter5;

import java.util.List;

import static java.lang.Math.PI;
import static java.lang.Math.random;
import static java.util.Arrays.asList;
//import static java.util.Arrays; // won't compile, say which static member to import
//static import java.lang.Math.random // don't put static before import

public class ZooParking {
    public static void main(String[] args) {
//        List<String> list = Array.asList("one", "two"); // Array is not imported
        List<String> list = asList("one", "two");
        double random = random();
        double pi = PI;
        System.out.println(pi);
        System.out.println(random);
    }
}
