package Chapter5.pond.duck;

import Chapter5.pond.goose.LostDuckling;
import Chapter5.pond.shore.BirdWatcher;

public class TestDucks {
    public static void main(String[] args) {
         GoodDuckling duck = new GoodDuckling();
         duck.makeNoise();
        BadDuckling duck2 = new BadDuckling();
        duck2.makeNoise();
        BirdWatcher bw = new BirdWatcher();
        bw.watchBird();
        DuckTeacher dt = new DuckTeacher();
        dt.swim();
        LostDuckling ld = new LostDuckling();
        ld.swim();
    }
}
