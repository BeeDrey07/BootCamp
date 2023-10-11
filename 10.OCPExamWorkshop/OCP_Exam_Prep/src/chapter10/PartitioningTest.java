package chapter10;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class PartitioningTest {
    public static void main(String[] args) {
//        var ohMy = Stream.of("lions", "tigers", "bears");
//        Map<Boolean, List<String>> map = ohMy.collect(Collectors.partitioningBy(s -> s.length() <= 5));
//        System.out.println(map);
//        Map<Boolean, Set<String>> map = ohMy.collect(
//                Collectors.partitioningBy(s -> s.length() <= 7,
//                        Collectors.toSet())
//        );
//        System.out.println(map);

//        Map<Integer, Long> map = ohMy.collect(
//                Collectors.groupingBy(
//                        String::length,
//                        Collectors.counting()));
//        System.out.println(map);

//        var ohMy = Stream.of("lions", "tigers", "bears");
//        Map<Integer, Optional<Character>> map = ohMy.collect(
//                Collectors.groupingBy(
//                        String::length,
//                        Collectors.mapping(
//                                s -> s.charAt(0),
//                                Collectors.minBy((a, b) -> a - b))));
//        System.out.println(map);

        var ohMy = Stream.of("lions", "tigers", "bears");

        var map = ohMy.collect(groupingBy(String::length,
                mapping(s -> s.charAt(0), minBy((a,b) -> a - b))));
        System.out.println(map);

//        record Separations(String spaceSeparated, String commaSeparated) {}
//
//        var list = List.of("x", "y", "z");
//        Separations result = list.stream()
//                .collect(Collectors.teeing(
//                        Collectors.joining(" "),
//                        Collectors.joining(","),
//                        (s, c) -> new Separations(s, c)));
//        System.out.println(result);
    }
}
