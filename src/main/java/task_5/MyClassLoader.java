package task_5;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

public class MyClassLoader extends ClassLoader {
    private HashMap save;

    public MyClassLoader(HashMap save) {
        this.save = save;
    }

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException { //загрузчик класса
        FileInputStream fileInputStream = null;
        try {
            if (!save.containsKey(name)) {
                return super.findSystemClass(name); // загрузка с помощью системного загрузчика (если наш загрузчик не сработает)
            }
            String fileName = (String) save.get(name);
            fileInputStream = new FileInputStream(fileName);
            File filePath = new File(fileName);
            byte[] tmpBuffer = Files.readAllBytes(Paths.get(fileName));
            fileInputStream.read(tmpBuffer);
            return defineClass(name, tmpBuffer, 0, tmpBuffer.length); // метод для конвертирования массива байтов в класс
        } catch (IOException e) {
            e.printStackTrace();
            throw new ClassNotFoundException(e.getMessage(), e);
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
