package chapter13;

import java.util.List;

public class ParallelDecompTest {
    public static void main(String[] args) {
//        long start = System.currentTimeMillis();
//        List.of(1, 2, 3, 4, 5)
//                .parallelStream()
//                .map(w -> doWork(w))
//                .forEachOrdered(s -> System.out.print(s + " "));
//
//        System.out.println();
//        var timeTaken = (System.currentTimeMillis() - start) / 1000;
//        System.out.println("Time: " + timeTaken + " seconds");
        System.out.print(List.of(1,2,3,4,5,6)
                .parallelStream()
                .findAny()
                .get());
    }

    private static int doWork(int input) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
        return input;
    }
}
