package com.nickbryanmiller;

import sun.awt.image.ImageWatched;

public class LinkedComposite extends Composite {
    String value = "LinkedComposite";
    LinkedList<Composite> myList;

    public LinkedComposite(Composite... comps) {
        this.value = "LinkedComposite";
        myList = new LinkedList<Composite>();
        add(comps);
    }

    @Override
    public void add(Composite... comps) {
        for (Composite comp : comps) {
            myList.addNode(comp);
        }
    }
    @Override
    public void remove(Composite comp) {
        myList.deleteWithValue(comp);
    }
    @Override
    public LinkedList<Composite> getComponentList() {
        return this.myList;
    }
    @Override
    public void objectToString() {
        Node<Composite> head = myList.getHead();
        if (head != null) {
            System.out.println(this.getValue() + " Containing");
            objectToString(head, myList, "\t");
        }
        else {
            System.out.println(this.getValue());
        }
    }
    public void objectToString(Node<Composite> head, LinkedList<Composite> aList, String indents) {
        while (head != null) {
            if (head.value instanceof LinkedComposite) {
                LinkedComposite lc = ((LinkedComposite) head.value);
                System.out.println(indents + lc.value + " Containing");
                objectToString(lc.myList.getHead(), lc.myList, indents + "\t");
            }
            else if (head.value instanceof Leaf) {
                Leaf leaf = ((Leaf) head.value);
                System.out.println(indents + "Leaf " + leaf.value);
            }
            head = head.next;
        }
    }

    @Override
    public Object getValue() {
        return value;
    }
}