package chapter11;

public class FinallyTest {
    public static void main(String[] args) {
        FinallyTest ft = new FinallyTest();
        ft.exploreAnimals();
    }

    void exploreAnimals() {
        try {
            seeAnimals();
            fall();
        } catch (Exception e) {
            getHugFromDaddy();
        } finally {
            System.out.println("Let's see the animals");
        }
    }
    void seeAnimals() {
        System.out.println("Let's see animals");
    }

    void fall() {
        System.out.println("Falling");
        throw new RuntimeException();
    }

    void getHugFromDaddy() {
        System.out.println("BIG HUG FROM DADDY!");
    }
}


