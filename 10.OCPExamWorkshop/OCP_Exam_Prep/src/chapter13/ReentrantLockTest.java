package chapter13;

import java.util.concurrent.locks.*;

public class ReentrantLockTest {

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        new Thread(() -> printHello(lock)).start();
        if (lock.tryLock()) {
            try {
                System.out.println("Lock obtained, entering protected code");
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println("Unable to acquire lock, doing something else");
        }
    }

    public static void printHello(Lock lock) {
        try {
            lock.lock();
            System.out.println("Hello");
        } finally {
            lock.unlock();
        }
    }
}

