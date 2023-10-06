package chapter10;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveStreamTest {
    public static void main(String[] args) {
//        Stream<Integer> stream = Stream.of(1, 2, 3);
//        System.out.println(stream.reduce(0, (s, n) -> s + n));
//        Stream<Integer> intStream = Stream.of(1, 2, 3);
//        System.out.println(stream.mapToInt(x -> x).sum());

//        IntStream intStream = IntStream.of(1, 2, 3);
//        OptionalDouble avg = intStream.average();
//        if (avg.isPresent())
//            System.out.println(avg.getAsDouble());

        // Infinite primitive streams

//        var random = DoubleStream.generate(Math::random);
//        var fractions = DoubleStream.iterate(.5,d->d/2);
//        random.limit(3).forEach(System.out::println);
//        fractions.limit(3).forEach(System.out::println);
//        IntStream.range(1, 6).forEach(System.out::println);
//        System.out.println("***********");
//        IntStream.rangeClosed(1, 6).forEach(System.out::println);
        Stream.of("penguin", "fish").peek(System.out::println).mapToInt(s -> s.length()).forEach(System.out::println);
    }
}
