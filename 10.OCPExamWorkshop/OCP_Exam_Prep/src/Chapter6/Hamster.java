package Chapter6;

public class Hamster {
    private String colour;
    private int weight;

    public Hamster(int weight, String colour) {
        this.weight = weight;
        this.colour = colour;
    }

    public Hamster(int weight) {
        this(weight, "brown");
    }

    public static void main(String[] args) {
        var h1 = new Hamster(12);
        System.out.println(h1);
        var h2 = new Hamster(12, "white");
        System.out.println(h2);
    }

    @Override
    public String toString() {
        return this.weight + " " + this.colour;
    }
}
