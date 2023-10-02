package book3.chapter4;

public class Ball {

    private double weight;

    protected double getWeight() {
        return this.weight;
    }

    public static void main(String[] args) {
        BaseBall b1 = new BaseBall();
        b1.hit();
    }

    protected void setWeight(double weight) {
        this.weight = weight;
    }

    public void hit() {
        System.out.println("You hit a mile!");
    }
}

class BaseBall extends Ball {
    public BaseBall() {
        setWeight(5.125);
    }

    public void hit() {
        System.out.println("You tore off the cover.");
        super.hit();
    }
}
