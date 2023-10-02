package book4.chapter5;

class Employee {
    public String lastName;
    public String firstName;

    public Employee() {
    }

    public Employee(String last, String first) {
        this.lastName = last;
        this.firstName = first;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}

class HourlyEmployee extends Employee {
    public double hourlyRate;

    public HourlyEmployee(String last, String first) {
        super(last, first);
    }

}