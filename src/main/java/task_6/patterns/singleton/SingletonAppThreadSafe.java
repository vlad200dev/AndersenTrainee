package task_6.patterns.singleton;

public class SingletonAppThreadSafe {
    public static int counter = 0;
    private static volatile SingletonAppThreadSafe instance;

    private SingletonAppThreadSafe() {
        counter++;
    };

    public static SingletonAppThreadSafe getInstance() {
        if (instance == null) {
            synchronized (SingletonAppThreadSafe.class) {
                instance = new SingletonAppThreadSafe();
            }
        }
        return instance;
    }
}
