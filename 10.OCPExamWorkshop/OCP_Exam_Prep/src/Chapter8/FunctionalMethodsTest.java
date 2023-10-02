package Chapter8;

import org.w3c.dom.ls.LSOutput;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalMethodsTest {
    public static void main(String[] args) {
//        Predicate<String> egg = s -> s.contains("egg");
//        Predicate<String> brown = s -> s.contains("brown");
//
//        Predicate<String> brownEggs = egg.and(brown);
//        Predicate<String> otherEggs = egg.and(brown.negate());
//
//        System.out.println(brownEggs.test("brown eggs"));
//        System.out.println(otherEggs.test("scrambled eggs"));

//        Consumer<String> c1 = x -> System.out.println("1: " + x);
//        Consumer<String> c2 = x -> System.out.println("2: " + x);
//        Consumer<String > combined = c1.andThen(c2);
//        combined.accept("cat");

//        Function<Integer, Integer> result1 = x -> x + 600;
//        Function<Integer, Integer> result2 = x -> x / 2;
//        Function<Integer, Integer> combined = result2.compose(result1);
//        System.out.println(combined.apply(100));

        counts((var x, var y) -> "Hello"); //DOES NOT COMPILE
        counts2(( var x, var  y) -> true); // DOES NOT COMPILE
        counts3((String x, Double y, Integer z) -> true); // DOES NOT COMPILE
//        (Integer x, y) -> "goodbye" // DOES NOT COMPILE
    }

    static void counts(TestingA a) {
        System.out.println(a.testTest(2, 2));

    }

    static void counts2(TestingB b) {
        System.out.println(b.testTestB(2, 2));
    }

    static void counts3(TestingC c) {
        System.out.println(c.testTestC("Dog",2.0, 5));
    }

    public void variables(int a) {
        int b = 1;
        Predicate<Integer> p1 = a2 -> {
            int b2 = 0;
            int c = 0;
            return b ==c;
        };
    }

}

interface TestingA {
    String testTest(int n1, Integer num2);
}

interface TestingB {
    Boolean testTestB(int n1, Integer num2);
}

interface TestingC {
    Boolean testTestC(String s, Double d, Integer i);
}
