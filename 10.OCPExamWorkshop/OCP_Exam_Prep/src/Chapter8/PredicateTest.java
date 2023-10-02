package Chapter8;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
//        Predicate<String> mr = String::isEmpty;
//        Predicate<String> l = s -> s.isEmpty();
//        System.out.println(mr.test(""));

        BiPredicate<String, String> mr = String::startsWith;
        BiPredicate<String, String> l = (s1, s2) -> s1.startsWith(s2);
        System.out.println(mr.test("bianca", "b"));
    }
}
