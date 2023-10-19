package lesson6.exercises;

public class ShoppingCart {

    public static void main(String args[]) {
        // Declare and initialize 2 Item objects
        Item item1, item2;
        item1 = new Item();
        item2 = new Item();

        // Print both item descriptions and run code.
        item1.desc = "Burger";
        item2.desc = "Coca-Cola";

        // Assign one item to another and run it again.
        item1 = item2;
        System.out.println("Item1 is:" + item1.desc);
        System.out.println("Item2 is:" + item1.desc);
    }

}