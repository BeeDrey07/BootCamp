package Lesson13.exercise2;

import java.util.ArrayList;
import java.util.function.Predicate;

public class ShoppingCart {
    ArrayList<Item> items = new ArrayList();

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.fillCart();
        cart.removeItemFromCart("Shirt");
    }

    public void fillCart() {
        items.add(new Shirt(40.95, 'M', 'R'));
        items.add(new Shirt(32.99, 'M', 'Y'));
        items.add(new Trousers(59.99, 34, 'B', "Relaxed", 'M'));
        items.add(new Trousers(75.50, 8, 'G', "Skinny", 'F'));
    }

    public void removeItemFromCart(String desc) {
        // remove all Trousers from the items list, then print out the list
        items.removeIf(s -> s.getDesc().equals(desc));
        System.out.println("Cart after removing items: \n" + items);
    }

}
