package book3.chapter5;

public class TestBalls implements PlayableBall{
    @Override
    public void throwBall() {
        System.out.println("Throwing Ball.");
    }

    @Override
    public void kickBall() {
        System.out.println("Kicking Ball.");
    }

    @Override
    public void catchBall() {
        System.out.println("Catching Ball.");
    }

    @Override
    public void dropBall() {
        System.out.println("Dropping Ball.");
    }

    public static void main(String[] args) {
        TestBalls t = new TestBalls();
        t.dropBall();
        t.kickBall();
        t.throwBall();
        t.catchBall();
    }
}
