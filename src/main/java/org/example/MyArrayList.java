package org.example;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList<T> {


    private Object[] array;
    private int size;

    public MyArrayList() {
        this.size = 0;
        this.array = new Object[size];
    }

    public boolean add(T element) {
        array = new Object[size + 1];
        array[size] = element;
        size++;
        return true;
    }

    public int size() {
        return size;
    }

    public Object get(int index) {
        return array[index];
    }

    public void remove() {

    }

    public void contain() {

    }


    public boolean isEmpty() {
        return false;
    }

    public void clear() {

    }

    public void indexOf() {

    }
}
