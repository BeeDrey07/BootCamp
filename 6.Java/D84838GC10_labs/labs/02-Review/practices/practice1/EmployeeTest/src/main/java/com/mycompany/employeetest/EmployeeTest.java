/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employeetest;

/**
 *
 * @author Bianca
 */
public class EmployeeTest {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Employee emp1 = new Employee();
        emp1.setId(101);
        emp1.setName("Jane Smith");
        emp1.setSalary(120_345.27);
        emp1.setSocialSecurityNum("012-34-5678");
        System.out.println("Employee id : " + emp1.getId());
        System.out.println("Employee name : " + emp1.getName());
        System.out.println("Employee Salary : " + emp1.getSalary());
        System.out.println("Employee SSN : " + emp1.getSocialSecurityNum());
        
        Employee emp2 = new Employee();
        emp2.setId(102);
        emp2.setName("Bianca Dreyer");
        emp2.setSalary(130_378.57);
        emp2.setSocialSecurityNum("012-35-7911");
        System.out.println("Employee id : " + emp2.getId());
        System.out.println("Employee name : " + emp2.getName());
        System.out.println("Employee Salary : " + emp2.getSalary());
        System.out.println("Employee SSN : " + emp2.getSocialSecurityNum());
    }
}
