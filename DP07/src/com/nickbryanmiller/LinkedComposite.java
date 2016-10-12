package com.nickbryanmiller;

// This is a ConcreteComposite that uses a LinkedList as its composite list

import java.util.Iterator;

public class LinkedComposite extends Composite {
    String value = "LinkedComposite";
    LinkedList<Composite> myList;

    // Constructor that allows the option of adding composites during instantiation
    public LinkedComposite(Composite... comps) {
        this.value = "LinkedComposite";
        myList = new LinkedList<Composite>();
        addTM(comps);
    }

    // Uses varargs to add each component to the LinkedList
    @Override
    public void add(Composite... comps) {
        for (Composite comp : comps) {
            myList.addNode(comp);
        }
    }

    // Removes each of these composites from the LinkedList
    @Override
    public void remove(Composite... comps) {
        for (Composite comp : comps) {
            myList.deleteWithValue(comp);
        }
    }

    // Gets the list associated with this particular composite type
    @Override
    public LinkedList<Composite> getComponentList() {
        return this.myList;
    }

    // Grabs the name of this object
    @Override
    public Object getValue() {
        return value;
    }
}