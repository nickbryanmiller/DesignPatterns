package com.nickbryanmiller;

public class Node<T> {
    public T value;
    public Node<T> next;

    public Node(T v, Node<T> n) {
        this.value = v;
        this.next = n;
    }
    public Node(T v) {
        this.value = v;
        this.next = null;
    }

    public void setValue(T v) {
        this.value = v;
    }
    public T getValue() {
        return value;
    }

    public void setNext(Node<T> n) {
        this.next = n;
    }
    public Node<T> getNext() {
        return next;
    }
}