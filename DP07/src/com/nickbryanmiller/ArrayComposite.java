package com.nickbryanmiller;

// This is a ConcreteComposite that uses a DynamicArray as its composite list

public class ArrayComposite extends Composite {
    String value = "ArrayComposite";
    Array<Composite> array;

    // Constructor that allows the option of adding composites during instantiation
    public ArrayComposite(Composite... comps) {
        this.value = "ArrayComposite";
        array = new Array<Composite>();
        addTM(comps);
    }

    // Uses varargs to add each component to the DynamicArray
    @Override
    public void add(Composite... comps) {
        for (Composite comp : comps) {
            array.add(comp);
        }
    }

    // Removes each of these composites from the DynamicArray
    @Override
    public void remove(Composite... comps) {
        array.removeWithValues(comps);
    }

    // Gets the list associated with this particular composite type
    @Override
    public Array<Composite> getComponentList() {
        return this.array;
    }

    // Grabs the name of this object
    @Override
    public Object getValue() {
        return value;
    }
}