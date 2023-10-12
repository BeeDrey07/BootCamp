package Lesson12.exercise3;

public class ShoppingCart {
    public static void main(String[] args) {
        // declare and instantiate a Shirt object using an Item reference type
//        Item myShirt = new Shirt(230.50, 'M', 'B');
        Item myShirt = new Item("Trousers", 500.00);
        // call the display method on the object, then the getColor method
        myShirt.display();
        if (myShirt instanceof Shirt) {
            String shirtColor = ((Shirt) myShirt).getColor();
            System.out.println("The color of the shirt is : " + shirtColor);
        } else {
            System.out.println("Not a Shirt Object.");
        }
    }
}