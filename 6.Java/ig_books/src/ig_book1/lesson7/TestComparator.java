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
public class TestComparator {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>(3);
        Comparator<Student> sortName = new StudentSortName();
        Comparator<Student> sortGpa = new StudentSortGpa();
        studentList.add(new Student("Thomas Jefferson", 1111L, 3.8));
        studentList.add(new Student("John Adams", 2222L, 3.9));
        studentList.add(new Student("George Washington", 3333L, 3.4));
        System.out.println("Sorting Students in ascending order.");
        Collections.sort(studentList, sortName);
        for (Student student : studentList) {
            System.out.println(student);
        }
        System.out.println("\n************\n\n Sorting Gpa in descnding order");
        Collections.sort(studentList, sortGpa);
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

}
