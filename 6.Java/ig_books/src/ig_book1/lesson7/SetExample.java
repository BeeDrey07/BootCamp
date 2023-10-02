/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ig_book1.lesson7;

import java.util.*;

/**
 *
 * @author Bianca
 */
public class SetExample {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("A");
        set.add("D");
        set.add("B");
        set.add("B");

        for (String item : set) {
            System.out.println(item);
        }
    }
}
