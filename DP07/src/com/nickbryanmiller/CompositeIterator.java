package com.nickbryanmiller;

import java.util.Iterator;

public class CompositeIterator implements MyIterator<Composite> {

    private Composite comp;
    private int position = 0;
    private Node<Composite> head = null;
    private Node<Composite> node = null;


    public CompositeIterator(Composite compBase) {
        this.comp = compBase;
        if (comp instanceof LinkedComposite) {
            LinkedComposite lc = ((LinkedComposite) comp);
            LinkedList<Composite> children = lc.getComponentList();
            head = children.getHead();
            node = head;
        }
    }

    @Override
    public boolean isValid() {
        if (comp instanceof LinkedComposite) {
            LinkedComposite lc = ((LinkedComposite) comp);
            LinkedList<Composite> children = lc.getComponentList();
            if (node != null) {
                return true;
            }
            else {
                return false;
            }
        }
        else if (comp instanceof ArrayComposite) {
            ArrayComposite ac = ((ArrayComposite) comp);
            Array<Composite> children = ac.getComponentList();
            if (position < children.getSize()) {
                return true;
            }
            else {
                return false;
            }
        }
        else if (comp instanceof InstanceComposite) {
            InstanceComposite ic = ((InstanceComposite) comp);
            Composite child = ic.getComponentList();
            if (child != null && position == 0) {
                return true;
            }
            else {
                return false;
            }
        }
        else if (comp instanceof StaticArrayComposite) {
            StaticArrayComposite sac = ((StaticArrayComposite) comp);
            Composite[] children = sac.getComponentList();
            while (position < children.length && children[position] == null) {
                position = position + 1;
            }
            if (position >= children.length) { return false; }
            if (children[position] != null) { return true; }
            return false;
        }
        else if (comp instanceof Leaf) {
            return false;
        }

        return false;
    }

    @Override
    public Composite getCurrent() {
        if (comp instanceof LinkedComposite) {
            LinkedComposite lc = ((LinkedComposite) comp);
            LinkedList<Composite> children = lc.getComponentList();
            Composite val = node.getValue();
            return val;
        }
        else if (comp instanceof ArrayComposite) {
            ArrayComposite ac = ((ArrayComposite) comp);
            Array<Composite> children = ac.getComponentList();
            Composite val = children.get(position);
            return val;
        }
        else if (comp instanceof InstanceComposite) {
            InstanceComposite ic = ((InstanceComposite) comp);
            Composite child = ic.getComponentList();
            if (child != null && position == 0) {
                return child;
            }
            else {
                return null;
            }
        }
        else if (comp instanceof StaticArrayComposite) {
            StaticArrayComposite sac = ((StaticArrayComposite) comp);
            Composite[] children = sac.getComponentList();
            if (position < children.length) {
                Composite val = children[position];
                return val;
            }
            else {
                return null;
            }

        }
        else if (comp instanceof Leaf) {
            return null;
        }

        return null;
    }

    @Override
    public void first() {
        position = 0;
        node = head;
    }

    @Override
    public void next() {
        position = position + 1;
        if (comp instanceof LinkedComposite) {
            node = node.next;
        }
    }
}