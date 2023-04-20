package org.example;


public class MyHashMap<K, V> {
    private MyArrayList<K> keys;
    private MyArrayList<V> values;
    private int size;

    public MyHashMap() {
        this.keys = new MyArrayList<>();
        this.values = new MyArrayList<>();
        this.size = 0;
    }

    public V put(K key, V value) {
        if (keys.contains(key)) {
            return get(key);
        }
        keys.add(key);
        values.add(value);
        size++;
        return null;
    }

    public int size() {
        return size;
    }

    public V get(K key) {
        for (int i = 0; i < size; i++) {
            if (keys.get(i).equals(key)) {
                return values.get(i);
            }
        }
        return null;
    }

    public V remove(K key) {
        for (int i = 0; i < size; i++) {
            if (keys.get(i).equals(key)) {
                V value = values.get(i);
                values.remove(i);
                keys.remove(i);
                size--;
                return value;
            }
        }
        return null;
    }


    public boolean containsKey(K key) {
        for (int i = 0; i < size; i++) {
            if (keys.get(i).equals(key)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsValue(V value) {
        for (int i = 0; i < size; i++) {
            if (values.get(i).equals(value)) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        keys = new MyArrayList<>();
        values = new MyArrayList<>();
        size = 0;
    }

    public boolean isEmpty() {
        return keys.isEmpty();
    }
}
