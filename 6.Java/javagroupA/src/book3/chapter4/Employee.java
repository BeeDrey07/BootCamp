package book3.chapter4;

import java.text.NumberFormat;
import java.util.Scanner;

public class Employee {
    public Employee getEmployee() {
        return this;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Salary or hourly: ");
        String wageType = sc.nextLine();
        System.out.println("Please enter your salary or rate: ");
        Double wage = sc.nextDouble();
        String msg;

        if (wageType.equalsIgnoreCase("Salary")) {
            Employee emp = new SalariedEmployee(wage);
            ((SalariedEmployee) emp).getFormattedSalary();
        } else if (wageType.equalsIgnoreCase("Hourly")) {
            Employee emp = new HourlyEmployee(wage);
            ((HourlyEmployee) emp).getFormattedRate();
        }

    }
}

class SalariedEmployee extends Employee {
    double salary;

    public SalariedEmployee(double salary) {
        this.salary = salary;
    }

    public void getFormattedSalary() {
        NumberFormat sf = NumberFormat.getCurrencyInstance();
        System.out.println("The employee's salary is " + sf.format(this.salary));
    }
}


class HourlyEmployee extends Employee {
    double rate;

    public HourlyEmployee(double rate) {
        this.rate = rate;
    }


    public void getFormattedRate() {
        NumberFormat sf = NumberFormat.getCurrencyInstance();
        String msg = sf.format(this.rate);
        System.out.println("Hourly rate is: " + msg);
    }
}

