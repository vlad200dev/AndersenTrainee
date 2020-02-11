package task_4.multithread;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Считаем что поток фур на погрузку постоянен
 */
public class LogisticTask {
    private Queue<Truck> ship = new ArrayDeque<>(); // очередь из фур.
    private final int limit = 10;
    private final Lock lock = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {
        LogisticTask logisticTask = new LogisticTask();
        Runnable upload = () -> {
            try {
                logisticTask.upload();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Runnable download = () -> {
            try {
                logisticTask.download();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Thread uploadTruck = new Thread(upload);
        Thread downLoadTruck = new Thread(download);
        uploadTruck.start();
        downLoadTruck.start();
        uploadTruck.join();
        downLoadTruck.join();
    }

    public void upload() throws InterruptedException {
        while (true) {
           lock.lock();
                if (ship.size() == limit) {
                    lock.unlock();
                }
                try {
                    Truck newComingTruck = generateTruck();
                    ship.offer(newComingTruck);
                }
                finally {
                lock.unlock();
            }
        }
    }
    public void download() throws InterruptedException {
        while (true) {
            TimeUnit.SECONDS.sleep(1);
            lock.lock();
            try{
                if (ship.size() == 0) {
                    lock.unlock();
                }
                Truck truck = ship.poll();
                System.out.println(truck);
                System.out.printf("queue reached: %d\n", ship.size());
            } finally {
                lock.unlock();
            }
        }
    }

    private Truck generateTruck() {
        Truck truck = null;
        Random random = new Random();
        int id = random.nextInt(1000);
        List<String> goodsList = new ArrayList<>();
        Collections.addAll(goodsList, "Bakery", "Meat", "Vegetables", "Fruits");
        while (true) {
            truck = new Truck(id, goodsList.get(random.nextInt(4)));
            return truck;
        }
    }

}
