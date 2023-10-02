package Chapter5;

public class DogWalker {
    public static void main(String[] args) {
        walkDog(100);
        walkDog(1, 2,3);
        walkDog(199, new int[] {4,5,6,7,8,9});
        walkDog(100);
    }

    public static void walkDog (int start, int... steps) {
        System.out.println("start is " + start);
        System.out.println("length of steps is " + steps.length);
    }
}
