package task_4.multithread;

import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * Считаем что поток фур на погрузку постоянен
 */
public class LogisticTask {
    private Queue<Truck> ship = new ArrayDeque<>(); // очередь из фур. Для усложнения используем несинхронизированный класс
    private final int limit = 10;
    private final Object lock = new Object();

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

    public void upload() throws InterruptedException { // погрузка
        while (true) {
            synchronized (lock) {
                if (ship.size() == limit) {
                    lock.wait();
                }
                Truck newComingTruck = generateTruck();
                ship.offer(newComingTruck);
                lock.notify();
            }
        }
    }

    public void download() throws InterruptedException { // выгрузка
        while (true) {
            TimeUnit.SECONDS.sleep(1);
            synchronized (lock) {
                if (ship.size() == 0) {
                    lock.wait();
                }
                Truck truck = ship.poll();
                System.out.println(truck);
                lock.notify();
                System.out.printf("queue reached: %d\n", ship.size());
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
