package task_7.two_level_cache;

import java.io.IOException;
import java.io.Serializable;

public class TwoLevelCache<K extends Serializable, V extends Serializable> implements Cache<K, V> {
        private final InFileCache<K,V> firstLevelCache;
        private final InMemoryCache<K,V> secondLevelCache;
        private Priority priority;

    public TwoLevelCache(Priority priority) throws IOException {
        this.firstLevelCache = new InFileCache<>();
        this.secondLevelCache = new InMemoryCache<>();
        this.priority = Priority.HIGH;
    }

    public TwoLevelCache() throws IOException {
        this.firstLevelCache = new InFileCache<>();
        this.secondLevelCache = new InMemoryCache<>();
        this.priority = Priority.LOW;
    }

    @Override
    public void put(K key, V value) throws IOException {
        if (priority == Priority.HIGH){
            secondLevelCache.put(key,value);
        } else {
            firstLevelCache.put(key,value);
        }
    }

    @Override
    public V get(K key) throws IOException {
        V value = null;
        if (firstLevelCache.containsKey(key)){
            value = firstLevelCache.get(key);
        } else if (secondLevelCache.containsKey(key)){
            value = secondLevelCache.get(key);
        }
        return value;
    }

    @Override
    public boolean containsKey(K key) {
        if (firstLevelCache.containsKey(key)) {
            return true;
        }
        if (secondLevelCache.containsKey(key)) {
            return true;
        }
        return false;
    }

    @Override
    public void remove(K key) {
        if (firstLevelCache.containsKey(key)){
            firstLevelCache.remove(key);
        } else if (secondLevelCache.containsKey(key)){
            secondLevelCache.remove(key);
        }
    }

    @Override
    public void clear() throws IOException {
        firstLevelCache.clear();
        secondLevelCache.clear();
    }

    @Override
    public int size() {
       return firstLevelCache.size() + secondLevelCache.size();
    }
}
