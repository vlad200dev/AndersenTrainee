package task_7.two_level_cache;

import java.io.IOException;

public class ClientClass  {
    public static void main(String[] args) throws IOException {
        Facade<String,Integer> impl1 = new Facade<>();
        Facade<String,Integer> implm2 = new Facade<>(Priority.HIGH);

    }
}
