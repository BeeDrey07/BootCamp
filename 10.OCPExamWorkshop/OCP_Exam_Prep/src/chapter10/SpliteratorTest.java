package chapter10;

import java.util.List;
import java.util.Map;
import java.util.Spliterator;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SpliteratorTest {
    public static void main(String[] args) {
//        var stream = List.of("bird", "bunny", "cat", "dog", "fish", "lamb", "mouse");
//
//        Spliterator<String> originalBagOfFood = stream.spliterator();
//        Spliterator<String> emmasBag = originalBagOfFood.trySplit();
//        emmasBag.forEachRemaining(System.out::println);
//        Spliterator<String> jillsBag = originalBagOfFood.trySplit();
//        jillsBag.tryAdvance(System.out::println);
//        originalBagOfFood.forEachRemaining(System.out::println);

//        var originalBag = Stream.iterate(1, n -> ++n)
//                .spliterator();
//        Spliterator<Integer> newBag = originalBag.trySplit();
//        newBag.tryAdvance(System.out::println);
//        newBag.tryAdvance(System.out::println);
//        newBag.tryAdvance(System.out::println);

//        var ohMy = Stream.of("Lions", "Tigers", "Bears");
//        String animals = ohMy.collect(Collectors.joining(" "));
//        System.out.println(animals);

//        var ohMy = Stream.of("Lions", "Tigers", "Bears");
//        Double result = ohMy.collect(Collectors.averagingInt(String::length));
//        System.out.println(result);

//        var ohMy = Stream.of("Lions", "Tigers", "Bears");
//        TreeSet<String> result = ohMy.filter((e -> e.startsWith("T"))).collect(Collectors.toCollection(TreeSet::new));
//        System.out.println(result);

//        var ohMy = Stream.of("Lions", "Tigers", "Bears");
//        Map<String, Integer> map = ohMy.collect(Collectors.toMap(s-> s, String::length));
//        System.out.println(map);

//        var ohMy = Stream.of("Lions", "Tigers", "Bears");
//        Map<String, Integer> map = ohMy.collect(Collectors.toMap(
//                String::length,
//                k -> k,
//                (s1, s2) -> s1 + "," + s2));
//        System.out.println(map);
//        System.out.println(map.getClass());
//
//    }
    }
}
