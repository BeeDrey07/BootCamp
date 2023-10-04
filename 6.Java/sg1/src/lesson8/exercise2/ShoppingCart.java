package lesson8.exercise2;

public class ShoppingCart {
    public static void main(String[] args) {
        Item item1 = new Item();
        item1.setItemFields("Skirt", 3, 150.99);
        System.out.println("First setItemFieldsMethod: ");
        item1.displayItem();

        int returnValue = item1.setItemFields("Jeans", 5, 100.75, 'P');
        System.out.println(" ");
        System.out.println("Second setItemFields method: ");
        if (returnValue < 0) {
            System.out.println("Invalid color code!! Could not add item.");
        } else {
            item1.displayItem();
        }
    }
}
