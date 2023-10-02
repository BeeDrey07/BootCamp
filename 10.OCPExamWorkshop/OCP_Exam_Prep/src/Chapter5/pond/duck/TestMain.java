package Chapter5.pond.duck;

import Chapter5.Snake;
import Chapter5.pond.goose.LostDuckling;

public class TestMain {
    public static void main(String[] args) {
//        TestDucks.main(new String[6]);
        LostDuckling duck = new LostDuckling();
        duck.swim();
        Snake snake = new Snake();
        snake = null;
        snake.makeSnakeNoise();
    }
}
