package chapter13;

import java.util.concurrent.*;

public class SheepManager {
    private int sheepCount = 0;

    private void incrementAndReport() {
        synchronized (SheepManager.class) {
            System.out.println((++sheepCount) + " ");
        }

    }

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(20);
        try {
            SheepManager manager = new SheepManager();
            for (int i = 0; i < 10; i++)
                service.submit(() -> manager.incrementAndReport());
        } finally {
            service.shutdown();
        }
    }
}

