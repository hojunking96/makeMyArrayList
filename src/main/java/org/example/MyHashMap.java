package org.example;


import java.util.ArrayList;
import java.util.List;

public class MyHashMap<K, V> {
    private List<K> keys;
    private List<V> values;

    public MyHashMap() {
        this.keys = new ArrayList<>();
        this.values = new ArrayList<>();
    }

    public V put(K key, V value) {
        if (keys.contains(key)) {
            return get(key);
        }
        keys.add(key);
        values.add(value);
        return null;
    }

    public int size() {
        return keys.size();
    }

    public V get(K key) {
        for (int i = 0; i < keys.size(); i++) {
            if (keys.get(i).equals(key)) {
                return values.get(i);
            }
        }
        return null;
    }

    public V remove(K key) {
        return null;
    }


    public boolean containsKey(K key) {
        for (K element : keys) {
            if (element.equals(key)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsValue(V value) {
        for (V element : values) {
            if (element.equals(value)) {
                return true;
            }
        }
        return false;
    }

    public void clear() {

    }

    public void isEmpty() {

    }

}
