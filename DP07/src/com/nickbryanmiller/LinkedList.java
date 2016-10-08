package com.nickbryanmiller;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;
    int size;

    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

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

    public int getSize() {
        return size;
    }

    public Node<T> getHead() {
        return head;
    }

    public void printList() {
        Node<T> p = head;
        while (p != null) {
            System.out.println(p.value);
            p = p.next;
        }
    }
}