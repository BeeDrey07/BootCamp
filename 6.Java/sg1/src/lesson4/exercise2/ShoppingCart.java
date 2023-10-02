package lesson4.exercise2;

public class ShoppingCart {

    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";
        String message = custName + " wants to purchase a " + itemDesc;

        // Declare and initialize numeric fields: price, tax, quantity, and total.
        double price = 150;
        double tax = (0.14 * price);
        int quantity = 5;
        // Modify message to include quantity
        message = custName + " wants to purchase a " + itemDesc + ". So she purchased " +
        quantity + ".";

        System.out.println(message);

        // Calculate total and then print the total cost
        double total = (price + tax) * quantity;

        System.out.println("The total cost is: " + total);
    }
}
