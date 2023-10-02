package Chapter5;

public class Panda {
    final static String name = "Ronda";
    static final int bamboo;
    // static final double height; does not compile because it is not initialised
    static {bamboo = 5;}
}
