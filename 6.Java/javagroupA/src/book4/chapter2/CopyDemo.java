package book4.chapter2;
import java.util.Arrays;
public class CopyDemo {
    public static void main(String[] args) {
        int arrayOriginal[] = {42, 55, 21};
        int arrayNew[]= Arrays.copyOf(arrayOriginal, 10);
        printIntArray(arrayNew);
    }

    public static void printIntArray(int arrayNew[]) {
        for (int i : arrayNew) {
            System.out.println(i);
            System.out.print(' ');
        }
        System.out.println();
    }
}
