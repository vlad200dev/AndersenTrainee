package task_4.multithread;

import java.util.concurrent.TimeUnit;

public class Basic {
    public static void main(String[] args) {
        Runnable logicOfThread2 = () -> {
            for (int i = 0; i < 5; i++) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Some logic working from second thread");
            }
        };
        Thread thread2 = new Thread(logicOfThread2);
        thread2.start();
        System.out.println("Hello from main thread");
    }
}
