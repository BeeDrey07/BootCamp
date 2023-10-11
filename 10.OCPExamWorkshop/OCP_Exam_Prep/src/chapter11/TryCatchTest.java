package chapter11;

public class TryCatchTest {
    public static void main(String[] args) {
        TryCatchTest tct = new TryCatchTest();
        tct.explore();
    }

    void fall() {
        throw new RuntimeException();
    }

    void getUp() {
        System.out.println("Get Up!");
    }

    void seeAnimals() {
        System.out.println("Let's see the animals!");
    }

    void explore() {
        try {
            fall();
            System.out.println("never get here");
        } catch (RuntimeException e) {
            getUp();
        }
        seeAnimals();
    }
}
