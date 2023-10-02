package Chapter8;


import java.util.*;

record Animal(String species, boolean canHop, boolean canSwim) {
}

@FunctionalInterface
interface CheckTrait {
    boolean test(Animal a);
}

class CheckIfHopper implements CheckTrait {
    public boolean test(Animal a) {
        return a.canHop();
    }
}


@FunctionalInterface
interface Sprint {
    public void sprint(int speed);
}

@FunctionalInterface
interface Dash extends Sprint {
}

//@FunctionalInterface
interface Skip extends Sprint {
    void skip();
}

//@FunctionalInterface
interface Sleep {
    private void snore() {
    }

    default int getZzz() {
        return 1;
    }
}

@FunctionalInterface
interface Climb {
    void reach();

    default void fall() {

    }

    static int getBackup() {
        return 100;
    }

    private static boolean checkHeight() {
        return true;
    }

}

interface soar {
    abstract String toString();
}

@FunctionalInterface
interface Dive {
    @Override
    String toString();
    @Override
    public boolean equals(Object o);
    @Override
    public abstract int hashCode();
    public void dive();
}

interface Dive2 {
    @Override
    String toString();
    public boolean equals(String o);
    @Override
    public abstract int hashCode();
    public void dive();
}



public class TraditionalSearch {


    public static void main(String[] args) {

        // list of animals
        var animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));
        print(animals, a -> a.canSwim());
    }

    private static void print(List<Animal> animals, CheckTrait checker) {
        System.out.println("Animals that can swim");
        for (Animal animal : animals) {
            if (checker.test(animal))
                System.out.print(animal + " ");
        }
        System.out.println();
    }


}


