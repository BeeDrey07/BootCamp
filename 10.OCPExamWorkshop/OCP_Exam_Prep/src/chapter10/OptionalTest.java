package chapter10;

import java.util.Optional;

public class OptionalTest {
    public static Optional<Double> average(int... scores) {
        if (scores.length == 0) {
            return Optional.empty();
        }
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
//        return Optional.of((double) sum / scores.length);
        Optional o = (scores.length == 0) ? Optional.empty() : Optional.of((double) sum / scores.length);
        return o;
    }

    public static void main(String[] args) {
//        System.out.println(average(90, 100, 400, 300));
//        System.out.println(average());

//        Optional<Double> opt = average(100, 200);
////        Optional o = (opt == null) ? Optional.empty() : Optional.of(opt);
//        Optional o = Optional.ofNullable(opt);
//        System.out.println(o.get());

//        Optional<Double> opt = average(90, 100);
//        opt.ifPresent(System.out::println);
        Optional<Double> opt = average();
        System.out.println(opt.orElse(Double.NaN));
        System.out.println(opt.orElseGet(() -> Math.random()));
//        System.out.println(opt.orElseThrow());
        System.out.println(opt.orElseThrow(() -> new IllegalStateException()));
    }
}