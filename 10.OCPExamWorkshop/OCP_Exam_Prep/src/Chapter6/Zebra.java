package Chapter6;

public class Zebra extends Animal2 {
    public Zebra(int age) {
        super(age, "Zebra");
    }

    public Zebra() {
        this(4);
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getAge();
    }
}
