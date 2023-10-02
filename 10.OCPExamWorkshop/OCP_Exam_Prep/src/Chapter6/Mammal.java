package Chapter6;

public class Mammal {
    public Mammal(int age) {
    }
}

class Seal extends Mammal {
    public Seal(int age) {
        super(age);
    }

    public Seal() {
        this(1);
    }
}

class Elephant extends Mammal {
    public Elephant(int age) {
        super(age);
    }

    public Elephant() {
        this(1);
    }
}

