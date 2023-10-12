package chapter13;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentCollectionsTest {
    public static void main(String[] args) {
//        var foodData = new ConcurrentHashMap<String, Integer>();
//        foodData.put("penguin", 1);
//        foodData.put("flamingo", 2);
//        for (String key : foodData.keySet())
//            foodData.remove(key);
//        System.out.println(foodData);
        List<Integer> favNumbers = new CopyOnWriteArrayList<>(List.of(4, 3, 42));
        for (var n : favNumbers) {
            System.out.print(n + " "); // 4 3 42
            favNumbers.add(n + 1);
        }
        System.out.println();
        System.out.println("Size: " + favNumbers.size()); // Size: 6
    }
}
