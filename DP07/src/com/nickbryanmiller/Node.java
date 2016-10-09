package com.nickbryanmiller;

// This is a container class that the LinkedList uses
// It is a template (in this case it filled with Composite Objects

public class Node<T> {
    public T value; // This would be our Composite Objects
    public Node<T> next;

    // Constructors for setting initial values or null
    public Node(T v, Node<T> n) {
        this.value = v;
        this.next = n;
    }
    public Node(T v) {
        this.value = v;
        this.next = null;
    }

    // Sets the value if you wanted to make the attribute private
    public void setValue(T v) {
        this.value = v;
    }

    // Gets the value if you wanted to make the attribute private
    public T getValue() {
        return value;
    }

    // Sets the next node if you wanted to make the attribute private
    public void setNext(Node<T> n) {
        this.next = n;
    }

    // Gets the next node if you wanted to make the attribute private
    public Node<T> getNext() {
        return next;
    }
}