package task_4.multithread;

public class Basic2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Starting work");
        Runnable runnable = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Second thread working");
            }
        };
        Thread thread2 = new Thread(runnable);
        thread2.setDaemon(true);
        thread2.start();
        thread2.interrupt();
        while (thread2.isInterrupted()) {
            System.out.println("Main thread working");
        }
    }
}
