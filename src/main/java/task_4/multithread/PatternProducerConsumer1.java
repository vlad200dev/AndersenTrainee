package task_4.multithread;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
Паттерн Producer-Consumer  - рабочий вариант
 */
public class PatternProducerConsumer1 {
    private static BlockingQueue<Integer> que = new ArrayBlockingQueue<>(10); // FIFO. Потокобезопасная
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(()->{
            try {
                produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread thread2 = new Thread(()->{
            try {
                consumer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread1.start(); // поток производитель
        thread2.start(); // поток потребитель
        thread1.join();
        thread2.join();
        System.out.println("Main thread finished as well");
    }

    private static void produce() throws InterruptedException { // создает
        Random random = new Random();
        while (true){
            que.put(random.nextInt(100)); // ждет если очередь полна
        }
    }
    private static void consumer() throws InterruptedException { // вытаскивает
        while (true){
                Thread.sleep(100);
                System.out.println(que.take()); // забирает элемент ,ждет если очередать пуста
                System.out.println("Queue size is" + que.size());
            }
        }
}

