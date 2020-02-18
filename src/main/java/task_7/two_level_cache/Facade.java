package task_7.two_level_cache;

import java.io.IOException;
import java.io.Serializable;

public class Facade<K extends Serializable, V extends Serializable>  {
    private TwoLevelCache<K, V> realization;

    public Facade() throws IOException {
        this.realization = new TwoLevelCache<>();
    }

    public Facade(Priority priority) throws IOException {
        this.realization = new TwoLevelCache<>(priority);
    }

    public void put(K key, V value) throws IOException {
        realization.put(key,value);
    }


    public V get(K key) throws IOException {
        return realization.get(key);
    }


    public void remove(K key) {
        realization.remove(key);
    }

    public void clear() throws IOException {
        realization.clear();
    }

    public int size() {
        return realization.size();
    }
}
