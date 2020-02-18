package task_7.two_level_cache;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;



public class InFileCache<K extends Serializable, V extends Serializable> implements Cache<K, V> {

    private final Path directory;
    private final Map<K, String> storage;
    private int capacity;

    public InFileCache() throws IOException {
        this.directory = Files.createTempDirectory("cache");
        this.directory.toFile().deleteOnExit();
        this.storage = new HashMap<>();
    }

    public InFileCache(int capacity) throws IOException {
        this.capacity = capacity;
        this.directory = Files.createTempDirectory("cache");
        this.directory.toFile().deleteOnExit();
        this.storage = new HashMap<>(capacity);
    }

    @Override
    public void put(K key, V value) throws IOException {
        FileOutputStream fo = null;
        ObjectOutputStream os = null;
        var tmpFile = Files.createTempFile(directory, "", "").toFile();
        try {
            fo = new FileOutputStream(tmpFile);
            os = new ObjectOutputStream(fo);
            os.writeObject(value);
            os.flush();
            storage.put(key, tmpFile.getName()); //Returns the name of the file or directory
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            fo.close();
            os.close();
        }
    }

    @Override
    public V get(K key) throws IOException {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        var fileName = storage.get(key);
        try {
            fis = new FileInputStream(new File(directory + "\\" + fileName));
            ois = new ObjectInputStream(fis);
            Object value = ois.readObject();
                return (V) value;
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        } finally {
            fis.close();
            ois.close();
        }
        return null;
    }

    @Override
    public void remove(K key) {
        storage.remove(key);
    }

    @Override
    public void clear() throws IOException {
        Files.walk(directory).filter(Files::isRegularFile).map(Path::toFile).forEach(File::delete);
    }

    @Override
    public int size() {
        return storage.size();
    }

    @Override
    public boolean containsKey(K key) {
        return storage.containsKey(key);
    }
}
