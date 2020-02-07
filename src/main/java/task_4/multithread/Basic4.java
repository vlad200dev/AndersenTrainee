package task_4.multithread;

public class Basic4 {
    public static void main(String[] args) {
        Runnable logic = () -> {
            for (int i = 0; i < 50; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i+1);
            }
        };

        Thread thread_name_1 = new Thread(logic);
        Thread thread_name_2 = new Thread(logic);
        thread_name_1.start();
        thread_name_2.start();
    }
}
