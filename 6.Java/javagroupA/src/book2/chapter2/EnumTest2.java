package book2.chapter2;

public class EnumTest2 {
    public enum Food {HOTWINGS, PIZZA, RIBS, BURGERS}

    public static void main(String[] args) {
        Food suit;
        suit = Food.RIBS;
        System.out.println("The food is " + suit);
    }
}
