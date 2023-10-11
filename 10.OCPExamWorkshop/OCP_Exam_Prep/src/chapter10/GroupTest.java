package chapter10;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupTest {
    public static void main(String[] args) {
        var ohMy = Stream.of("lions", "tigers", "bears");
//        Map<Integer, List<String>> map = ohMy.collect(Collectors.groupingBy(String::length));
//        System.out.println(map);

//        Map<Integer, Set<String>> map = ohMy.collect(Collectors.groupingBy(
//                String::length,
//                Collectors.toSet()));
//        System.out.println(map);

//        TreeMap<Integer, Set<String>> map = ohMy.collect(Collectors.groupingBy(
//                String::length,
//                TreeMap::new,
//                Collectors.toSet()));
//        System.out.println(map);

        TreeMap<Integer, List<String>> map = ohMy.collect(
                Collectors.groupingBy(
                        String::length,
                        TreeMap::new,
                        Collectors.toList()));
        System.out.println(map);
    }
}
