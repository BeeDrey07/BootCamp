package chapter9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class RemoveIfTest {
    public static void main(String[] args) {
//        Collection<String> list = new ArrayList<>();
//        list.add("magician");
//        list.add("Assisstant");
//        System.out.println(list);
//        list.removeIf(s -> s.startsWith("A"));
//        System.out.println(list);

        Collection<String> set = new HashSet<>();
        set.add("wand");
        set.add("");
        System.out.println(set);
        set.removeIf(String::isEmpty);
        System.out.println(set);

        
    }
}
