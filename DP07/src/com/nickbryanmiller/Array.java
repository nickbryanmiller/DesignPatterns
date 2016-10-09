package com.nickbryanmiller;

import java.util.ArrayList;

// This is my own Array that has an ArrayList as its backbone
// It is dynamically resizing and returns the exact array size you need

public class Array<T> {

    private ArrayList<T> array;

    public Array() {
        array = new ArrayList<T>();
    }

    public void clear()  { array.clear(); }
    public int getSize() { return array.size(); }

    public void add(T key) { array.add(key); }

    // Get element at index
    public T get(int index) {
        if (index >= array.size()) { return null; }
        return array.get(index);
    }
    // Remove element at index
    public void removeAtIndex(int index) {
        if (index >= array.size()) { return; }
        array.remove(index);
    }
    // Remove element
    public void removeWithValues(T... keys) {
        for (T key : keys) {
            array.remove(key);
        }
    }

    public void removeAll(T key) {
        for (int i = 0; i < array.size(); i++) {
            int index = array.indexOf(key);
            if (index >= 0) {
                array.remove(index);
            }
            i = i - 1;
        }
    }

    // Turn the arraylist into an array of fixed size
    public Composite[] getArray() {
        return array.toArray(new Composite[array.size()]);
    }
}