package org.example;

import java.util.Arrays;

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
            array = Arrays.copyOf(array, size);
        }
        array[size - 1] = element;
        return true;
    }

    public int size() {
        return size;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (T) array[index];
    }

    public T remove(int index) {
        T removedObject = get(index);
        size--;

        if (size <= capacity - 15) {
            capacity -= 10;
            Object[] newArray = new Object[capacity];
            System.arraycopy(array, 0, newArray, 0, capacity);
            array = newArray;
        }

        return removedObject;
    }


    public boolean contains(T object) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(object)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(T object) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(object)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        size = 0;
        capacity = 10;
        array = new Object[capacity];
    }
}
