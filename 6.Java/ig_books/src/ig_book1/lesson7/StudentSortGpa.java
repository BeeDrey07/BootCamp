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
public class StudentSortGpa implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        if (s1.getGpa() < s2.getGpa()) {
            return 1;
        } else if (s1.getGpa() > s2.getGpa()) {
            return -1;
        } else {
            return 0;
        }

    }
}

