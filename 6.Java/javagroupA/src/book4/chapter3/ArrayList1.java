package book4.chapter3;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
    public static void main(String[] args) {
//        ArrayList signs = new ArrayList(100);
//        signs.add(100);
//        signs.add("hi");
//        System.out.println(signs);
//        ArrayList<String> signs = new ArrayList<>();
//        ArrayList<Employee> signs = new ArrayList<>();
//        Employee emp = new Employee("Dreyer", "Bianca");
//        signs.add("Bianca");
//        signs.add(emp.toString());
//        signs.add(emp);
//        signs.add(25);
//        System.out.println(signs);

//        ArrayList<String> nums = new ArrayList<>(2);
//        nums.add("One");
//        nums.add("Two");
//        nums.add("Three");
//        nums.add("Four");
//        nums.add(10, "Eleven");
//        System.out.println(nums);
//        for(int i=0; i < nums.size(); i++) {
//            System.out.println(nums.get(i));
//        }
//        for(String i: nums) {
//            System.out.println(i);
//        }

//        for(String i: nums) {
//            int e = nums.indexOf(i);
//            System.out.println("Item " + e + " : " + i);
//        }

//        Iterator e = nums.iterator();
//        while (e.hasNext()) {
//            String s = (String) e.next();
//            System.out.println(s);
//        }

//        String first = nums.set(0, "Uno");
//        String second = nums.set(1, "Dos");
//        String third = nums.set(2, "Dres");
//        System.out.println(first);
//        System.out.println(second);
//        System.out.println(third);
//        System.out.println(nums);
//    }

//        ArrayList<String> newItems = new ArrayList<>(4);
//        newItems.add("Uno");
//        newItems.add("Dos");
//        newItems.add("Tres");
//        newItems.add("Cuatro");
//
//        for (int i = 0; i < nums.size(); i++) {
//            System.out.println(nums.set(i, newItems.get(i)));
//        }
//        System.out.println(nums);
//
//    }
//
        ArrayList<Employee> emps1 = new ArrayList<>();
        Employee emp1 = new Employee("Addams", "Gomez");
        Employee emp2 = new Employee("Taylor", "Andy");
        Employee emp3 = new Employee("Kirk", "James");
        emps1.add(emp1);
        emps1.add(emp2);
        emps1.add(emp3);
        System.out.println(emps1);
        emps1.remove(emp2);
        System.out.println(emps1);
//
        ArrayList<Employee> emps2 = new ArrayList<>();
        emps2.add(emp2);
        emps2.add(emp3);
        System.out.println(emps1);
//        emps1.removeAll(emps2);
        emps1.retainAll(emps2);
        System.out.println(emps1);
    }
}
//    @Override
//    public Iterator iterator() {
//        return null;
//    }


    class Employee {
        String lastname;
        String firstname;

        public Employee(String lastname, String firstname) {
            this.firstname = firstname;
            this.lastname = lastname;
        }

        @Override
        public String toString() {
            return this.lastname + " " + this.firstname;
        }
    }



