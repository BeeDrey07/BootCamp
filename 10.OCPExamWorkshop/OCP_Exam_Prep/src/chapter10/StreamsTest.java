package chapter10;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.List.of;

public class StreamsTest {
    public static void main(String[] args) {
//        Stream<Double> randoms = Stream.generate(Math::random);
//        randoms.forEach(e-> System.out.println(e));
//        Stream<Integer> addNumbers = Stream.iterate(1, n -> n < 100, n -> n + 2);
//        System.out.println(addNumbers);
//        addNumbers.forEach(e -> System.out.println(e));

//        Stream<String> s = Stream.of("monkey", "age", "bonobo");
//        Optional<String> min = s.min((s1, s2) -> s1.length()-s2.length());
//        min.ifPresent(System.out::println);
//
//        Stream<String> ss = Stream.of("monkey", "age", "bonobo");
//        Optional<String> max = ss.max((s1, s2) -> s1.length()-s2.length());
//        max.ifPresent(System.out::println);

//        Optional<?> minEmpty = Stream.empty().min((s1, s2) -> 0);
//        System.out.println(minEmpty.isPresent());
//
//        Optional<String> minNotEmpty = Stream.of("ff", "hhh").min((s1, s2) -> s1.length() - s2.length());
//        if (minNotEmpty.isPresent()) {
//            System.out.println(minNotEmpty.get());

//        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
//        Stream<String> infinite = Stream.generate(() -> "chimp");
//        infinite.forEach(e -> System.out.println(e));

//        s.findAny().ifPresent(System.out::println);
//        infinite.findFirst().ifPresent(System.out::println);
//        var list = of("monkey", "2", "chimp");
//        Stream<String> infinite = Stream.generate(() -> "chimp");

//        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
//        System.out.println(list.stream().anyMatch(pred));
//        System.out.println(list.stream().allMatch(pred));
//        System.out.println(list.stream().noneMatch(pred));
//        System.out.println(infinite.anyMatch(pred));

//        Stream<String> s = Stream.of("Monkey", "Gorilla", "Bonobo");
//        s.forEach(System.out::println);

//        Stream<String> stream = Stream.of("n", "o", "l", "f");
//        String word = stream.reduce("",(s,c) -> s.concat(c));
//        System.out.println(word);

//        Stream<String> stream = Stream.of("n", "o", "l", "f");
//        String word = stream.reduce("", String::concat);
//        System.out.println(word);

//        Stream<Integer> stream = Stream.of(3,5,6);
//        Integer answer = stream.reduce(1, (a, b) -> a*b);
//        System.out.println(answer);

//        BinaryOperator<Integer> op =(a, b) -> a*b;
//        Stream<Integer> empty = Stream.empty();
//        Stream<Integer> oneElement = Stream.of(3);
//        Stream<Integer> threeElements = Stream.of(3, 5, 6);
//
//        empty.reduce(op).ifPresent(System.out::println);
//        oneElement.reduce(op).ifPresent(System.out::println);
//        threeElements.reduce(op).ifPresent(System.out::println);

//        Stream<String> stream = Stream.of("w", "o", "l", "f");
//        int length = stream.reduce(0, (i, s) -> {
//            System.out.println("i is " + i);
//            System.out.println("s is " + s);
//            System.out.println(i + s.length());
//            return i + s.length();
//        },
//        (a,b) ->

//        Stream<String> stream = Stream.of("w", "o", "l", "f");
//
//        StringBuilder word = stream.parallel().collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
//        System.out.println(word);

//        TreeSet<String> set = stream.parallel().collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
//        System.out.println(set);

//        TreeSet<String> set = stream.collect(Collectors.toCollection(TreeSet::new));
//        System.out.println(set);
//
//        Set<String> set = stream.collect(Collectors.toSet());
//        System.out.println(set);
//
//        HashSet<String> set = stream.collect(Collectors.toCollection(HashSet::new));
//        System.out.println(set);

//        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
//        s.filter(x -> x.startsWith("m")).forEach(System.out::println);

//        Stream<String> s = Stream.of("duck", "duck", "duck", "goose");
//        s.distinct().forEach(System.out::println);

//        Stream<Integer> s = Stream.iterate(1, n -> n + 1);
//        s.skip(5)
//                .limit(2)
//                .forEach(System.out::println);

//        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
//        s.map(String::length).forEach(System.out::println);

//        List<String> zero = List.of();
//        var one = List.of("Bonobo");
//        var two = List.of("Mama Gorilla", "Baby Gorilla");
//        Stream<List<String>> animals = Stream.of(zero, one, two);
//        animals.flatMap(m -> m.stream()).forEach(System.out::println);

//        var zero = Stream.of();
//        var one = Stream.of("Bonobo");
//        var two = Stream.of("Mama Gorilla", "Baby Gorilla");
//        Stream<?> s = Stream.concat(zero, one);
//
//        Stream.concat(s, two).forEach(System.out::println);

//        Stream<String> s = Stream.of("brown bear", "grizzly");
////        s.sorted().forEach(System.out::println);
//        s.sorted(Comparator.reverseOrder())
//                .forEach(System.out::println);

//        var stream = Stream.of("black bear", "brown bear", "grizzly", "giraffe");
//
//        long count = stream.filter(e -> e.startsWith("g"))
//                .peek(System.out::println)
//                .count();
//
//        System.out.println(count);

//        var numbers = new ArrayList<>();
//        var letters = new ArrayList<>();
//
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        letters.add('a');
//        letters.add('b');
//
//        Stream<List<?>> stream = Stream.of(numbers, letters);
//
//        stream
//                .peek(System.out::println)
//                .map(x -> x.size())
//                .peek(System.out::println)
//                .forEach(System.out::println);

//        var list = List.of("Toby", "Anna", "Leroy", "Alex");
//        list
//                .stream()
//                .filter(e -> e.length() == 4)
//                .sorted()
//                .limit(2)
//                .forEach(System.out::println);

//        Stream.generate(() -> "Elsa")
//                .filter(n -> n.length() == 4)
//                .limit(2)
//                .sorted()
//                .forEach(System.out::println);

//        Stream.generate(() -> "Olaf Lazisson")
//                .filter(n -> n.length() == 4)
//                .limit(2)
//                .sorted()
//                .forEach(System.out::println);

//        long count = Stream.of("goldfish", "finch")
//                .filter(e -> e.length() > 5)
//                .collect(Collectors.toList())
//                .stream()
//                .peek(System.out::println)
//                .count();
//        System.out.println(count);

        List<String> list = Stream.of("goldfish", "finch")
                .filter(e -> e.length() > 5)
                .peek(System.out::println)
                .collect(Collectors.toList());
        long count = list
                .stream()
                .count();
        System.out.println(count);
    }
}


