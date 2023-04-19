package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyArrayList<T> {

    private Object[] array;
    private int size;
    private int capacity;

    public MyArrayList() {
        this.size = 0;
        this.capacity = 10;
        this.array = new Object[capacity];
    }

    public boolean add(T element) {
        size++;
        if (capacity == size) {
            capacity += 10;
            Object[] newArray = Arrays.copyOf(array, size);
            array = newArray;
        }
        array[size - 1] = element;
        return true;
    }

    public int size() {
        return size;
    }

    public Object get(int index) {
        return array[index];
    }

    public Object remove(int index) {
        size--;
        Object removedObject = get(index);
        return removedObject;
    }

    public boolean contains(Object object) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(object)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(Object object) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(object)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return false;
    }

    public void clear() {

    }

}
