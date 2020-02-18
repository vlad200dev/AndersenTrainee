package task_7.two_level_cache;

import java.io.IOException;

public interface Cache<K, V> {
     void put(K key, V value) throws IOException;
     V get(K key) throws IOException;
     void remove(K key);
     void clear() throws IOException;
     int size();
     boolean containsKey(K key);
}
