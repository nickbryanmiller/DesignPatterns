package com.nickbryanmiller;

import java.util.Iterator;

public class CompositeIterator implements Iterator<Composite> {

    private Composite comp;
    private int position = 0;

    public CompositeIterator(Composite compBase) {
        this.comp = compBase;
    }

    @Override
    public boolean hasNext() {
        if (comp instanceof LinkedComposite) {
            LinkedComposite lc = ((LinkedComposite) comp);
            LinkedList<Composite> children = lc.getComponentList();
            if (position < children.getSize()) {
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
    public Composite next() {
        if (comp instanceof LinkedComposite) {
            LinkedComposite lc = ((LinkedComposite) comp);
            LinkedList<Composite> children = lc.getComponentList();
            Composite val = children.getAtPosition(position);
            position = position + 1;
            return val;
        }
        else if (comp instanceof ArrayComposite) {
            ArrayComposite ac = ((ArrayComposite) comp);
            Array<Composite> children = ac.getComponentList();
            Composite val = children.get(position);
            position = position + 1;
            return val;
        }
        else if (comp instanceof InstanceComposite) {
            InstanceComposite ic = ((InstanceComposite) comp);
            Composite child = ic.getComponentList();
            if (child != null && position == 0) {
                position = position + 1;
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
                position = position + 1;
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
    public void remove() {
        // we don't support that
    }
}