package lesson8.exercise1;

public class ShoppingCart {
    public static void main(String[] args) {
        Item item1 = new Item();

        if (item1.setColor('P')) {
            System.out.println("item1.color: " + item1.color);
        } else {
            System.out.println("The color is invalid!");
        }

    }
}
