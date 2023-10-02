package Chapter8;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerTest {
    //    Consumer<String> mr = System.out::println;
//    Consumer<String> l = s -> System.out.println(s);
//    mr.accept("bear");
//    l.accept("dog");
    public static void main(String[] args) {


        Map<String, Integer> map = new HashMap<>();

        BiConsumer<String, Integer> mr = map::put;
        BiConsumer<String, Integer> l = (s, i) -> map.put(s, i);
        mr.accept("chicken", 7);
        l.accept("chick", 1);

//    Set<String> keys = map.keySet;
        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}