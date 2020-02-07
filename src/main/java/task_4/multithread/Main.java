package task_4.multithread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread2 = new Thread(new DbKeeper().saveTo);
        Thread thread3 = new Thread(new DbKeeper().getFrom);
        thread2.start();
        thread3.start();
        for (int i = 0; i < 50; i++) {
            Thread.sleep(2000);
            System.out.println("interfere from Main thread");
        }
    }
}

class DbKeeper {
    List<Integer> simpleDB = Collections.synchronizedList(new ArrayList<>());

    Runnable saveTo = () -> {
        DbKeeper data = new DbKeeper();
        for (int i = 0; i < 50; i++) {
            data.simpleDB.add(i);
            System.out.println("value added");
        }
    };

    Runnable getFrom = () -> {
        DbKeeper data = new DbKeeper();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 50; i++) {
            int x = data.simpleDB.get(i);
            System.out.printf("Retrieving from db value %s\n", x);
        }
    };
}

