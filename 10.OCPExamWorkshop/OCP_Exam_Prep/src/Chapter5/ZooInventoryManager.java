package Chapter5;

public class ZooInventoryManager {
    public static final String[] TREATS = new String[10];

    public static void main(String[] args) {
        // TREATS = new STRING[10]; cannot change the reference of a constant object
        TREATS[0] = "popcorn"; // can change the values in a constant object
    }
}
