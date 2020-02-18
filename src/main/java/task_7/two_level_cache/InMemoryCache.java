package task_7.two_level_cache;

import java.util.HashMap;
import java.util.Map;

public class InMemoryCache<K,V> implements Cache<K,V> {
    private final Map<K, V> storage;
    private final int capacity;

     public InMemoryCache(int capacity) {
        this.capacity = capacity;
        this.storage = new HashMap<>(capacity);
    }

    public InMemoryCache() {
        this.storage = new HashMap<>();
        this.capacity = 0;
    }

    @Override
    public void put(K key, V value) {
        storage.put(key,value);
    }

    @Override
    public V get(K key) {
        return storage.get(key);
    }

    @Override
    public void remove(K key) {
        storage.remove(key);
    }

    @Override
    public void clear() {
        storage.clear();
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
