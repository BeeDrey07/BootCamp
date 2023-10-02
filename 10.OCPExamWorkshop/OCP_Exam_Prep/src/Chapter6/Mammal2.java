package Chapter6;

public abstract class Mammal2 {
    abstract void showHorn();

    abstract void eatLeaf();
}

abstract class Rhino extends Mammal2 {
    void showHorn() {
    } // Inherited from Mammal
}

class BlackRhino extends Rhino {
    void eatLeaf() {
    } // Inherited from Mammal
}
