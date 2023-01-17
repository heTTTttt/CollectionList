package map;

public interface MyMap<K, V> {
    boolean isEmpty();
    void put(K key, V value);
    V get(K key);
    void remove(K key);
    boolean contains(K key);
}
