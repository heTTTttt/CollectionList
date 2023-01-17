package map;

import java.lang.reflect.Array;

public class MyHashMap<K, V> implements MyMap<K, V> {

    private final static int DEFAULT_CAPACITY = 16;
    private int size;
    private Node<K, V>[] table;

    public MyHashMap(){
        table = createArray(DEFAULT_CAPACITY);
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void put(K key, V value) {
        Node<K, V> node;
        Node<K, V> newNode = new Node<>(key, value);
        int index = key.hashCode() & (table.length - 1);

        if ((node = table[index]) != null){
            while (node.next != null){
                node = node.next;
            }
            node.next = newNode;
        }else {
            table[index] = newNode;
        }

        table[index] = newNode;
    }

    @Override
    public V get(K key) {
        return null;
    }

    @Override
    public void remove(K key) {

    }

    @Override
    public boolean contains(K key) {
        return false;
    }

    private class Node<K, V>{
        K key;
        V value;
        Node<K, V> next;
        int hash;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
    private Node<K, V>[] createEmptyArray(Node<K, V> ... args){
        return args;
    }
    private Node<K, V>[] createArray(int length){
        Class<?> componentType = createEmptyArray().getClass().getComponentType();
        return (Node<K, V>[]) Array.newInstance(componentType, length);
    }
}
