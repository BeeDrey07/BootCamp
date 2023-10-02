package Chapter5;

public class StaticInit {
    private static int one = 0;

    private static final int two;
    private static final int three = 3;
    // private static final int four; // won't compile because it was not assigned a value

    static {
        two = 2; // compiles because it is the first time we are assigning a value to this final variable
        one = 1; // compiles because it is an instance variable. It can be reasigned a value
        // three = 3; // won't compile because this final variable was already given a value
    }
}
