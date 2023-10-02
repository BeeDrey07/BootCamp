package book3.chapter5;

public abstract class Ball {
    public abstract void hit(int batSpeed);

    public static void main(String[] args) {
//        Baseball b = new Baseball();
//        System.out.println(b.hit(200));
        BallFactory bf = new BallFactory();
        Ball ball1 = bf.getBall("baseball");
        Ball ball2 = bf.getBall("softball");
        ball1.hit(100);
        ball2.hit(200);
    }
}

class Baseball extends Ball {
    public void hit(int batSpeed) {
        System.out.println("Baseball is going at a speed of " + batSpeed);
    }
}

class SoftBall extends Ball {
    public void hit(int batSpeed) {
        System.out.println("Softball is going at a speed of " + batSpeed);
    }
}
