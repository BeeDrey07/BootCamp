package Chapter8;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryAndBinaryTest {
    public static void main(String[] args) {
        UnaryOperator<String> mr = String::toUpperCase;
        UnaryOperator<String> lambda = s-> s.toUpperCase();
        System.out.println(mr.apply("Bianca"));

        BinaryOperator<String> mr2 = String::concat;
        BinaryOperator<String> lambda2 = (s1, s2) -> s1.concat(s2);
        System.out.println(mr2.apply("Bianca", "Dreyer"));

        UnaryOperator<Integer> lambda3 = i -> i++;
        System.out.println(lambda3.apply(2));
        System.out.println(lambda3.apply(100));

        UnaryOperator<Double> mr4 = Math::floor;
        UnaryOperator<Double> lambda4 = d -> Math.floor(d);
        System.out.println(lambda4.apply(2.9999));

        BinaryOperator<Double> mr5 = Math::pow;
        BinaryOperator<Double> lambda5 = (d1, d2) -> Math.pow(d1, d2);
        System.out.println(mr5.apply(2.0, 5.0));
    }
}
