package Lesson13.exercise1;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingCart {
    public static void main(String[] args){
        String[] days = {"monday","saturday","tuesday","sunday","friday"};

        // Convert the days array into an ArrayList
        // Loop through the ArrayList, printing out "sunday" elements in
        //   upper case (use toUpperCase() method of String class)
        // Print all other days in lower case
        // Print out the ArrayList
        ArrayList<String> arrlist = new ArrayList<>(Arrays.asList(days));
        for(String day : days) {
            System.out.println(day);
            if(day == "sunday") {
                System.out.println(day.toUpperCase());
            }
        }
        System.out.println(arrlist);
    }
}
