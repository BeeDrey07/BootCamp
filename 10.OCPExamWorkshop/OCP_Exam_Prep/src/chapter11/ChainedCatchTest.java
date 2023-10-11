package chapter11;

public class ChainedCatchTest {
    public static void main(String[] args) {
        ChainedCatchTest cct = new ChainedCatchTest();
        cct.visitPorcupine();
    }

    public void visitPorcupine() {
        try {
            seeAnimal();
        } catch (AnimalOutForAWalk e) {
            System.out.println("try back later");
        } catch (ExhibitClosed e) {
            System.out.println("not today");
        }
    }

    public void seeAnimal() {
        System.out.println("Let's see the animals");
//        throw new AnimalsOutForAWalk();
//        throw new ExhibitClosed();
        throw new ExhibitClosedForLunch();
    }
}

class AnimalOutForAWalk extends RuntimeException {}

class ExhibitClosed extends RuntimeException {}

class ExhibitClosedForLunch extends ExhibitClosed {}
