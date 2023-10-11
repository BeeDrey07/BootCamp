package Lesson11.Exercise4;

import java.util.ArrayList;

public class ShoppingCart {
    public static void main(String[] args) {
        // Declare, instantiate, and initialize an ArrayList of Strings.  Print and test your code.
        ArrayList<String> moods = new ArrayList<>();
        moods.add("Happy");
        moods.add("Sad");
        moods.add("Hungry");
        moods.add("Tired");
        moods.add("Motivated");
        moods.add("Angry");
        System.out.println(moods);

        // add (insert) another element at a specific index
        moods.add(3, "Surprised");
        System.out.println(moods);
        // Check for the existence of a specific String element.
        //   If it exists, remove it.
        if(moods.contains("Tired")) {
            moods.remove("Tired");
        }
        System.out.println(moods);
    }
}
