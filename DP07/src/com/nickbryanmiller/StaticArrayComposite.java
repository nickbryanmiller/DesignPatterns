package com.nickbryanmiller;

// This is a ConcreteComposite that uses a StaticArray as its composite list
// The difference here is that the array is not resizing and the programmer picks the size
// of the array when instantiating

public class StaticArrayComposite extends Composite {
    String value = "StaticArrayComposite";
    Composite[] array;

    // Constructor that sets the size and allows the option of adding composites during instantiation
    public StaticArrayComposite(int size, Composite... comps) {
        this.value = "StaticArrayComposite";
        array = new Composite[size];
        addTM(comps);
    }

    // Uses varargs to add each component to the StaticArray
    @Override
    public void add(Composite... comps) {
        for (int j = 0; j < comps.length; j++) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == null) {
                    array[i] = comps[j];
                    break;
                }
            }
        }
    }

    // Helper method so that our remove method is less code
    public int getIndexOf(Composite[] compArray, Composite c) {
        for (int i = 0; i < compArray.length; i++) {
            if (compArray[i] == c) {
                return i;
            }
        }

        return -1;
    }

    // Removes each of these composites from the StaticArray
    @Override
    public void remove(Composite... comps) {
        for (int i = 0; i < comps.length; i++) {
            int index = getIndexOf(array, comps[i]);
            if (index >= 0) {
                System.out.println(index);
                array[index] = null;
            }
        }
    }

    // Gets the list associated with this particular composite type
    @Override
    public Composite[] getComponentList() {
        return this.array;
    }

    // Grabs the name of this object
    @Override
    public Object getValue() {
        return value;
    }
}