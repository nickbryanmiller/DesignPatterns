package com.nickbryanmiller;

// This is also of type composite so that we can downcast and see if it is a leaf
// It just holds the name of the leaf or whatever the given type is

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
