package lesson9.exercise2;

import lesson9.exercise2.Customer;

public class ShoppingCart {
    public static void main(String[] args) {
        // Declare, instantiate, and initialise a Customer object
        lesson9.exercise2.Customer cust1 = new Customer("Bianca Dreyer", "555-27-3981");

        // Print the customer object name
        System.out.println("Customer name: " + cust1.getName());
    }
}
