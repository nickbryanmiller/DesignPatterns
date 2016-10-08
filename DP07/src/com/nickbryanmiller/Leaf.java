package com.nickbryanmiller;

public class Leaf<T> extends Composite {
    public T value;

    public Leaf(T v) {
        this.value = v;
    }

    @Override
    public T getValue() {
        return value;
    }
}
