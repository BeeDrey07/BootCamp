package book3.chapter4;

public class Ball2 {
    public double weight;

    private double height;

    public Ball2(double weight, double height) {
        this.weight = weight;
        this.height = height;
        System.out.println("Hello from the BALL constructor.");
    }

    public Ball2(double weight) {
        this.weight = weight;
        this.height = 5;
        System.out.println("Hello from Constructor 1.");
    }

    public Ball2() {
        this.weight = 5;
        this.height = 5;
        System.out.println("Hello from constructor 2");
    }

    public String toString() {
        return "weight is " + weight + " , height is " + height;
    }

    public static void main(String[] args) {
        Baseball2 b = new Baseball2(5.125);
        System.out.println(b);
        Softball2 b2 = new Softball2(10.99);
        System.out.println(b2);
        Baseball2 b3 = new Baseball2(12.00);
        System.out.println(b3);
        Baseball2 b4 = new Baseball2();
        System.out.println(b4);
        Softball2 b5 = new Softball2(5.789, 3.542);
        Baseball2 b6 = new Baseball2();
        b.hit(b6);
        Ball2 b7 = new Baseball2();
        b.hit((Baseball2) b7);
    }
}

class Baseball2 extends Ball2 {
    public Baseball2(double weight) {
        super(weight);
        System.out.println("I am in the Baseball constructor.");
    }

    public Baseball2() {
        super();
    }

    public void hit(Baseball2 baseball) {
        System.out.println("I am hitting a baseball with " + baseball);
    }

    public Baseball2(double weight, double height) {
        super(weight, height);
    }
}

class Softball2 extends Ball2 {
    public Softball2(double weight) {
        super(weight);
        System.out.println("I am in the Softball constructor.");
    }

    public Softball2() {
        super();
    }

    public Softball2(double weight, double height) {
        super(weight, height);
    }
}

