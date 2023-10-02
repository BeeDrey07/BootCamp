package book3.chapter5;

public class BallFactory {
    public Ball getBall(String b) {
        if (b.equalsIgnoreCase("Baseball")) {
            return new Baseball();
        }
        if (b.equalsIgnoreCase("softball")) {
            return new SoftBall();
        }
        return null;
    }
}
