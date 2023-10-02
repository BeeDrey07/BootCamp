package lesson5.exercise2;

public class ShoppingCart {

    public static void main(String[] args) {
        // local variables
        String custName = "Mary Smith";
        String message = custName + " wants to purchase a several items.";

        //Declare and initialize the items String array
        String[] items = {"Burger", "Chips", "Wings", "Nachos"};

        // Change message to show the number of items purchased.
        message = custName + " wants to purchase " + items.length + " items.";
        System.out.println(message);

        // Print an element from the items array.
        System.out.println(items[2]);
        System.out.println(items[4]); // Results in an error because there are only 4 items.

    }

}
