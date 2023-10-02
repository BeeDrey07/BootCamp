package chapter9;

import java.util.Collection;
import java.util.List;

public class ForEachTest {
    public static void main(String[] args) {
        //uses a consumer
        Collection<String> cats = List.of("Annie", "Ripley");
        cats.forEach(System.out::println);
        cats.forEach(s -> System.out.println(s));
        System.out.println("Testing123");
    }
}
