package chapter9;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
//        Set<Character> letters = Set.of('z', 'o');
//        Set<Character> copy = Set.copyOf(letters);
//        System.out.println(letters);
//        System.out.println(copy);
        Set<Integer> set = new HashSet<>();
        boolean ret = set.add(66);
        set.add(10);
        set.add(10);
        set.add(8);
        System.out.println("Printing HashSet");
        set.forEach(System.out::println);
//        System.out.println(ret);

        Set<Integer> treeSet = new TreeSet<>();
        boolean ret2 = treeSet.add(66);
        treeSet.add(10);
        treeSet.add(10);
        treeSet.add(8);
        System.out.println("Printing TreeSet");
        treeSet.forEach(System.out::println);
//        System.out.println(ret2);
    }
}
