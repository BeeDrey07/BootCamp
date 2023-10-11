package chapter13;

import java.util.concurrent.*;

public class CheckResults {
    private static int counter = 0;
    public static void main(String[] unused) throws Exception {
//        new Thread(() -> {
//            for(int i = 0; i < 1_000_000; i++) counter++;
//        }).start();
//        while(counter < 1_000_000) {
//            System.out.println("Not reached yet");
//        }
//        System.out.println("Reached: "+counter);
        ExecutorService service = Executors.newSingleThreadExecutor();
        try {
            Future<?> result = service.submit(() -> {
                for(int i = 0; i < 1_000_000; i++) counter++;
            });
            result.get(10, TimeUnit.SECONDS); // Returns null for Runnable
            System.out.println("Reached!");
        } catch (TimeoutException e) {
            System.out.println("Not reached in time");
        } finally {
            service.shutdown();
        }
    }
}