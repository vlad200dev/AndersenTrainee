package task_5;

import java.util.HashMap;

public class ClientClass {
    public static void main(String[] args) throws ClassNotFoundException {
        HashMap save =new HashMap();
        save.put("task_5.Student","C:\\AndersenTrainee\\AndersenTrainee\\target\\classes\\task_5\\Student.class");
        MyClassLoader loader = new MyClassLoader(save);
        Class StudentGET =loader.loadClass("task_5.Student");

    }
}
