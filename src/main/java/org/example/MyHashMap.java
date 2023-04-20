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

    public Integer put(K key, V value) {
        if (!keys.contains(key)) {
            keys.add(key);
            values.add(value);
            return null;
        } else {
            return keys.indexOf(key);
        }
    }

    public int size() {
        return keys.size();
    }

    public void replace() {

    }

    public void get() {

    }

    public void remove() {

    }


    public void containsKey() {

    }

    public void containsValue() {

    }

    public void clear() {

    }

    public void isEmpty() {

    }

}
