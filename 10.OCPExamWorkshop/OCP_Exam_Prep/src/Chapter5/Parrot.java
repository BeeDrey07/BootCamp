package Chapter5;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;


public class Parrot {
    private static void print(List<Integer> i) {
        System.out.println("I");
    }

    private static void print(CharSequence c) {
        System.out.println("C");
    }

    private static void print(Object o) {
        System.out.println("O");
    }

    public static void main(String[] args) {
        print("abc");
        print(Arrays.asList(3));
        print(LocalDate.of(2019, Month.JULY,4));
    }
}
