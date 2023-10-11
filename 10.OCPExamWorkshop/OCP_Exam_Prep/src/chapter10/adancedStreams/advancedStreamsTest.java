package chapter10.adancedStreams;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class advancedStreamsTest {
    public static void main(String[] args) {
//        var cats = new ArrayList<String>();
//        cats.add("Annie");
//        cats.add(("Ripley"));
//        var stream = cats.stream();
//        cats.add("KC");
//        System.out.println(stream.count());
        Stream<Integer> ints= Stream.of(100, 200, 300);
        Optional<Integer> ints2 = ints.max((n,n2) -> n - n2);
        threeDigit(ints2);
    }
    private static void threeDigit(Optional<Integer> optional) {
        optional.map(n-> "" + n)
                .filter(s->s.length() == 3)
        .ifPresent(System.out::println);
    }
}


