package chapter9;

import java.util.Arrays;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        String[] array = new String[]{"a", "b", "c"};
        List<String> asList = Arrays.asList(array);
        List<String> of = List.of(array);
        List<String> copy = List.copyOf(asList);
        System.out.println(Arrays.toString(array));
        System.out.println(asList);
        System.out.println(of);
        System.out.println(copy);

        array[0] = "z";
        System.out.println("changed array");
        System.out.println(Arrays.toString(array));
        asList.set(0, "x");
//        asList.add("y"); // will give an error
        System.out.println(asList);
//        of.set(0, "x"); // will give error
//        copy.set(0, "x"); // will give error
    }
}
