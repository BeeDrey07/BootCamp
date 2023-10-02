package Chapter8;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
//        Supplier<LocalDate> mr = LocalDate::now;
//        Supplier<LocalDate>  l = () -> LocalDate.now();
//
//        LocalDate d1 = mr.get();
//        LocalDate d2 = l.get();
//
//        System.out.println(d1);
//        System.out.println(d2);

        Supplier<StringBuilder> s1 = StringBuilder::new;
        Supplier<StringBuilder> s2 = () -> new StringBuilder();
//        StringBuilder b1 = s1.get();
        System.out.println(s2.get());
    }
}
