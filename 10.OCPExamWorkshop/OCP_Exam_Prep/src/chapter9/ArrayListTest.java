package chapter9;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        var strings = new ArrayList<String>();
        strings.add("a");
        strings.add("a");
        for(String s: strings) {
            System.out.println(s);
        }

        System.out.println("Type object by default if type is not mentioned");
        var list = new ArrayList<>();
        list.add("a");
        list.add("a");
        for(Object o: list) {
            System.out.println(o);
        }
    }
}
