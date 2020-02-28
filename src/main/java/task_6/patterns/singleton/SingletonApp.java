package task_6.patterns.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 */
public class SingletonApp {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService threadPool = Executors.newFixedThreadPool(100);
        Runnable task = () -> {
            SingletonAppThreadSafe.getInstance();
            System.out.println(SingletonAppThreadSafe.counter);
        };
        for (int i = 0; i < 1000; i++) {
            threadPool.submit(task);
            threadPool.shutdown();
        }
    }
}

