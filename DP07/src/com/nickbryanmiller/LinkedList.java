package com.nickbryanmiller;

// This is a template LinkedList class that uses node containers (filled with Composite objects in this case)
// To create a linked chain of dynamic size

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;
    int size;

    // Constructor that sets the head and tail to null
    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    // Adds by appending the tail so we can work in O(1)
    public void addNode(T val) {
        if (head == null) {
            head = new Node<T>(val, null);
            tail = head;
            size = size + 1;
        }
        else {
            Node<T> p = tail;
            p.next = new Node<T>(val, null);
            tail = p.next;
            size = size + 1;
        }
    }

    // Traverses the LinkedList and removes the desired node
    public void deleteWithValue(T val) {
        if (head == null) {
            return;
        }
        if (head.value == val) {
            Node<T> toDelete = head;
            head = head.next;
            toDelete = null;
            size = size - 1;
        }
        else {
            Node<T> p = head;
            while (p.next != null && p.next.value != val) {
                p = p.next;
            }

            if (p.next == null) {
                return;
            }
            else if (p.next.value == val) {
                Node<T> toDelete = p.next;
                p.next = p.next.next;
                toDelete = null; // need to let the garbage collector clean up
                size = size - 1;
            }
        }
    }

    // Traverses the LinkedList and removes the node at the desired position
    public void deleteAtPosition(int position) {
        if ((position < 0) || (position > size)) {
            return;
        }
        if (position == 0) {
            Node<T> toDelete = head;
            head = head.next;
            toDelete = null;
            size = size - 1;
        }
        else {
            Node<T> p = head;
            for (int i = 1; i < position; i++) {
                p = p.next;
            }
            Node<T> toDelete = p.next;
            p.next = p.next.next;
            toDelete = null; // need to let the garbage collector clean up
            size = size - 1;
        }
    }

    // Gets the node at a desired position
    public T getAtPosition(int position) {
        if ((position < 0) || (position > size)) {
            return null;
        }
        else {
            Node<T> p = head;
            for (int i = 0; i < position; i++) {
                p = p.next;
            }
            return p.value;
        }
    }

    // Gets the size of the LinkedList
    public int getSize() {
        return size;
    }

    // Grabs the head of the LinkedList
    public Node<T> getHead() {
        return head;
    }

    // Just a basic print method for testing when initially making the LinkedList
    public void printList() {
        Node<T> p = head;
        while (p != null) {
            System.out.println(p.value);
            p = p.next;
        }
    }
}