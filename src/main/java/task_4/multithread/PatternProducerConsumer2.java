package task_4.multithread;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/**
 * Реализация паттерна Producer Consumer используя методы wait(), notify() - учебный вариант
 */
public class PatternProducerConsumer2 {
    private Queue<Integer> queue = new LinkedList(); // несинхронизированная очередь на основе LinkedList
    private final int limit = 10; // max количество в очереди
    private final Object lock = new Object(); // для реализации intrinsic lock-а (так проще пока мне понять)

    public static void main(String[] args) throws InterruptedException {
        PatternProducerConsumer2 pattern = new PatternProducerConsumer2();
        Runnable produce = () -> {
            try {
                pattern.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Runnable consume = () -> {
            try {
                pattern.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Thread producer = new Thread(produce);
        Thread consumer = new Thread(consume);
        System.out.println("Main thread starts other threads");
        producer.start();
        consumer.start();
        System.out.println("Main thread waits for others threads to finish");
        producer.join();
        consumer.join();
        System.out.println("Main thread finishes"); // никогда не дойдем, так как цикл бесконечный поставили
    }

    public void produce() throws InterruptedException {
        int x = 0;
        while (true) {
            synchronized (lock) {
                if (queue.size() == limit) {
                    lock.wait();
                }
                queue.offer(x); // исп стандартные методы
                x++;
                lock.notify();
            }
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            TimeUnit.SECONDS.sleep(1);
            synchronized (lock) {
                if (queue.size() == 0) {
                    lock.wait();
                }
                int y = queue.poll(); // исп стандартные методы
                System.out.println(y);
                lock.notify();
                System.out.printf("queue reached: %d\n", queue.size());
            }
        }
    }
}
