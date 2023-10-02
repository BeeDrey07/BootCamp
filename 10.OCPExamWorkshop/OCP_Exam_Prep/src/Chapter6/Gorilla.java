package Chapter6;

public class Gorilla extends Animal2 {
    public Gorilla(int age) {
        super(age,"Gorilla"); // Calls the first Animal constructor
    }
    public Gorilla() {
//        super(5); // Calls the second Animal constructor
        this(5);
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getAge();
    }

}