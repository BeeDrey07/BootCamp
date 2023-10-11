package chapter13;

import java.util.concurrent.*;

public class ThreadTest {
    public static void main(String[] args) {
//        new Thread() ->System.out.println("Hello").start();
//        System.out.println("World");

        Runnable printInventory = () -> System.out.println("Printing zoo inventory");
        Runnable printRecords = () -> {
            for (int i = 0; i < 3; i++)
                System.out.println("Printing Record: " + i);
        };

        ExecutorService service = Executors.newSingleThreadExecutor();
        try {
            System.out.println("begin");
            service.execute(printInventory);
            service.execute(printRecords);
            service.execute(printInventory);
            System.out.println("end");
        } finally {
            service.shutdown();
        }


//        System.out.println("begin");
//        new Thread(printInventory).start();
//        new Thread(printInventory).start();
//        new Thread(printInventory).start();
//        System.out.println("end");

//        var job = new Thread(() -> pause());
//        job.setDaemon(true);
//        System.out.println(job.getState());
//        job.start();
//        System.out.println(job.getState());
//        System.out.println("Main Method finished");
//        System.out.println(job.getState());
    }

    private static void pause() {
        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
        }
        System.out.println("Thread Finished!");
    }
}
