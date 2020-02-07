package task_4.multithread;

public class Basic3 {
    public static void main(String[] args) {
        Thread[] threads = {new BaseThread("Branch_thread_1"),
                new BaseThread("Branch_thread_2"),
                new BaseThread("Branch_thread_3"),
                new BaseThread("Branch_thread_3")
        };
        for (Thread thread : threads) {
            thread.start();
        }
    }
}
class BaseThread extends Thread{
    public BaseThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.printf("Hello from %s\n",super.getName());
        }
    }
}