package Chapter3;

public class ZooAnimal {
    public static void main(String[] args) {
    }
    class Zoo {

        enum Animal {BIRD, FISH, MAMMAL}

        static void printLocation(Animal a) {
            long type = switch (a) {
                case BIRD -> 1;
                case FISH -> 2;
                case MAMMAL -> 3;
                default -> 4;
            };
            System.out.print(type);
        }
    }
}
