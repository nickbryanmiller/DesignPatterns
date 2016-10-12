package com.nickbryanmiller;

public interface MyIterator<T> {
    public boolean hasNext();
    public T next();
    public void remove();
}