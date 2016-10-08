package com.nickbryanmiller;

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
    public void remove(Composite... comps) {
        for (Composite comp : comps) {
            myList.deleteWithValue(comp);
        }
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
            else if (head.value instanceof ArrayComposite) {
                ArrayComposite ac = ((ArrayComposite) head.value);
                System.out.println(indents + ac.value + " Containing");
                ac.objectToString(ac.array, indents + "\t");
            }
            else if (head.value instanceof InstanceComposite) {
                InstanceComposite ic = ((InstanceComposite) head.value);
                if (ic.variable != null) {
                    System.out.println(indents + ic.getValue() + " Containing");
                    ic.objectToString(ic.variable, indents + "\t");
                }
                else {
                    System.out.println(indents + this.getValue());
                }
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