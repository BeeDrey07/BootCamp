package chapter9;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;

public class MapTest {
    public static void main(String[] args) {
//        Map<String, String> map1 = Map.ofEntries(
//                Map.entry("George", "087-555-8971"),
//                Map.entry("Steve", "011-072-6541")
//        );
//        Map<String, String> map2 = Map.copyOf(map1);
//
//        Set<String> keys = map1.keySet();
//        for(String key: keys) {
//            System.out.println(key + " " + map1.get(key));
//        }
//        System.out.println("Printing from copy");
//        Set<String> keys2 = map2.keySet();
//        for(String key: keys2) {
//            System.out.println(key + " " + map2.get(key));
////            map2.clear(); //immutable, cannot change
//        }

        Map<String, String> animals = new HashMap<>();
        animals.put("Koala", "bamboo");
        animals.put("Lion", "meat");
        animals.put("Giraffe", "leaf");
//        System.out.println(animals.get("Koala"));
//        for(String k:animals.keySet()) {
//            System.out.println(k + " " + animals.get(k));
//        }

//        System.out.println(animals.containsKey("Lion"));
//        System.out.println(animals.containsValue("Lion"));
//        System.out.println(animals.containsValue("meat"));
//        System.out.println(animals.size());
//        animals.clear();
//        System.out.println(animals.size());
//        System.out.println(animals.isEmpty());

//        Map<Integer, Character> charsMap = new HashMap<>();
//        charsMap.put(1, 'a');
//        charsMap.put(2, 'b');
//        charsMap.put(3, 'c');
//        charsMap.forEach((key, val) -> System.out.println(key + " : " + val));
//        charsMap.values().forEach(v -> System.out.println(v));
//        charsMap.entrySet().forEach(e -> System.out.println(e));
//        charsMap.values().forEach(System.out::println);
//        charsMap.entrySet().forEach(System.out::println);
//        charsMap.entrySet().forEach(e-> System.out.println(e.getKey() + " : " + e.getValue()));

//        Map<Character, String> map = new HashMap<>();
//        map.put('x', "spot");
//        System.out.println("X marks the " + map.get('x'));
//        System.out.println("X marks the " + map.getOrDefault('x', ""));
//        System.out.println("Y marks the " + map.get('y'));
//        System.out.println("Y marks the " + map.getOrDefault('y', ""));

//        Map<Integer, Integer> map = new HashMap<>();
//        map.put(1, 2);
//        map.put(2, 4);
//        System.out.println(map);
//        Integer original = map.replace(2, 10);
//        System.out.println(map);
////        map.replaceAll((k, v) -> k + 2);
//        map.replaceAll((k, v) -> k * 2);
//        System.out.println(map);

//        Map<String, String> favorites = new HashMap<>();
//        favorites.put("Jenny", "bus tour");
//        favorites.put("Tom", null);
//        favorites.putIfAbsent("Jenny", "Tram");
//        favorites.putIfAbsent("Tom", "Tram");
//        favorites.putIfAbsent("Sam", "Tram");
//        System.out.println(favorites);

//        BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1:v2;
//
//        Map<String, String> favorites = new HashMap<>();
//        favorites.put("Jenny", "Bus Tour");
//        favorites.put("Tom", "Tram");
//
//        String jenny = favorites.merge("Jenny", "Skyride", mapper);
//        String tom = favorites.merge("Tom", "Skyride", mapper);
//
//        System.out.println(favorites);
//        System.out.println(jenny);
//        System.out.println(tom);

        BiFunction<String, String, String> mapper = (v1, v2) -> null;
        Map<String, String > favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Tour");
        favorites.put("Tom", "Bus Tour");
        favorites.merge("Jenny", "Skyride", mapper);
        favorites.merge("Sam", "Skyride", mapper);
        System.out.println(favorites);
    }
}
