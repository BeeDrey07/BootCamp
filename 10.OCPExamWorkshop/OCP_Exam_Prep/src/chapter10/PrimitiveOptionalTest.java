package chapter10;

import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveOptionalTest {
    public static void main(String[] args) {
//        OptionalDouble average = IntStream.range(1, 10).average();
//        average.ifPresent(System.out::println);
//        System.out.println(average.getAsDouble());
//        average = OptionalDouble.empty();
//        System.out.println(average.orElseGet(() -> Double.NaN));
//        LongStream longs = LongStream.of(5, 10);
//        long sum = longs.sum();
//        System.out.println(sum);
//        DoubleStream stream = DoubleStream.generate(() -> Math.PI);
//        stream.min();
        IntStream stream = IntStream.of(1, 2, 3);
        IntStream stream2 = IntStream.of();
        System.out.println(sum(stream));
        System.out.println(sum(stream2));
    }

    private static int max(IntStream ints) {
        OptionalInt optional = ints.max();
        return optional.orElseThrow(RuntimeException::new);
    }

    private static double sum(IntStream ints) {
        IntSummaryStatistics stats = ints.summaryStatistics();
        if (stats.getCount() == 0) {
            throw new RuntimeException();
        }
        return stats.getSum();
    }
}
