package chapter11;

public class Bunny {
    public static void main(String[] args)  {
        try {
            eatCarrot(0);
        } catch (NoMoreCarrotsException e) {

        }
    }

    private static void eatCarrot(int carrotsLeftOver) throws NoMoreCarrotsException {
        System.out.println("I am eating " + carrotsLeftOver + " 🥕🥕🥕");
    }
}

class NoMoreCarrotsException extends Exception {

}

