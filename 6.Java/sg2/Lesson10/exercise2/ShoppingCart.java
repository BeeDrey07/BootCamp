package Lesson10.exercise2;

public class ShoppingCart {
    public static void main(String args[]) {
        Order order = new Order("Bianca Dreyer", 1000, "GAU", Order.CORP);
        System.out.println("Discount is: " + order.getDiscount());
    }
}
