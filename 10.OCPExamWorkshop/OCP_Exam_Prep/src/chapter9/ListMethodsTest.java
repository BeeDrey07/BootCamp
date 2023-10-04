package chapter9;

import java.util.*;

public class ListMethodsTest {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("SD");
//        list.add(0, "NY");
//        list.set(1, "FL"); // [NY, FL]
//        System.out.println(list.get(0));
//        System.out.println(list);
//        list.remove(0);
//        System.out.println(list);
////        list.set(0, "?"); // gives error list is empty
//        var numbers = Arrays.asList(1, 2, 3);
//        System.out.println(numbers);
//        numbers.replaceAll(e -> e * 2);
//        System.out.println(numbers);

        List<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");
        Object[] objectArray = list.toArray();
        String[] stringArray = list.toArray(new String[0]);
        System.out.println(Arrays.toString(objectArray));
        System.out.println(Arrays.toString(stringArray));
        System.out.println("Clearing your list");
        list.clear();
        System.out.println(list);
//        System.out.println(objectArray.length);
//        System.out.println(stringArray.length);
    }
}
