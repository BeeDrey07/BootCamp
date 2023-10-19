package Lesson10.exercise2;

public class ShoppingCart {
    public static void main(String args[]) {
        Order order = new Order("Bianca Dreyer", 950, "GAU", Order.NONPROFIT);
        System.out.println("Discount is: " + order.getDiscount());
    }
}
