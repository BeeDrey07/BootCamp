package chapter13;

import java.util.concurrent.*;

public class ScheduledExecutorTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        ScheduledExecutorService service
                = Executors.newSingleThreadScheduledExecutor();

        Runnable task1 = () -> System.out.println("Hello Zoo");
        try {
            Thread.sleep(10);
        } catch (Exception e) {
            System.out.println("Ran out of time");
        }
        Callable<String> task2 = () -> "Monkey";
        Callable<String> task4 = () -> "Zebra";
        service.submit(task1);
        System.out.println(service.submit(task2).get(1, TimeUnit.SECONDS));
        service.submit(task1);
        System.out.println(service.submit(task4).get(1, TimeUnit.SECONDS));

        System.out.println("Hi");
    }
}
