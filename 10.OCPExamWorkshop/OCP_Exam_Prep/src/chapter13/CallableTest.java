package chapter13;

import java.util.concurrent.*;

public class CallableTest {
    public static void main(String[] args) throws InterruptedException {
        var service = Executors.newSingleThreadExecutor();
        try {
            Future<Integer> result = service.submit(() -> 4 + 6);
        } finally {
            service.shutdown();
        }
        service.awaitTermination(1, TimeUnit.MINUTES);
        if(service.isTerminated()) System.out.println("Finished!");
        else System.out.println("At least one task is still running");
    }

}
