package com.nickbryanmiller;

public interface MyIterator<T> {
    public boolean isValid();
    public T getCurrent();
    public void next();
    public void first();
    public void nextForPreorderGOF();
}