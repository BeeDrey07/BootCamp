package com.example;

import com.example.domain.*;

public class EmployeeTest {

    public static void main(String[] args) {
        Engineer eng1 = new Engineer(101, "Jane Smith", "012-34-5678", 120_345.270);
        Manager man1 = new Manager(207, "Barbara Johnson","054-12-2367", 109_501.36, "US Marketing");
        Admin admin1 = new Admin(304, "Bill Munroe", "108-23-6509", 75_002.34);
        Director dir1 = new Director(12, "Susan Wheeler", "099-45-2340", 120_567.36, "Global Marketing", 1_000_000.00);
        eng1.printEmployee();
        man1.printEmployee();
        admin1.printEmployee();
        dir1.printEmployee();
        man1.setName("Betty Boop");
        man1.raiseSalary(50_000.00);
        man1.printEmployee();
    }
}