package book2.chapter5;

public class CountBothWays {

    public static void main(String[] args) {
        int a, b;
        for (a = 1, b = 10; a <= 10; a++, b--) {
            System.out.println(a + " " + b);
        }
    }
}
