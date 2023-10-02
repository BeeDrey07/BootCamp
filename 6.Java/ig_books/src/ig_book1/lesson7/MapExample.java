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
public class MapExample {

    public static void main(String[] args) {
        Map<String, String> partList = new TreeMap<>();
        partList.put("S001", "Blue Polo Shirt");
        partList.put("S002", "Black Polo Shirt");
        partList.put("H01", "Duke Hat");

        Set<String> keys = partList.keySet();

        for (String key : keys) {
            System.out.println("Parts#: " + key + " " + partList.get(key));
        }
    }
}