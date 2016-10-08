package com.nickbryanmiller;

public class ArrayComposite extends Composite {
    String value = "ArrayComposite";
    Array<Composite> array;

    public ArrayComposite(Composite... comps) {
        this.value = "ArrayComposite";
        array = new Array<Composite>();
        add(comps);
    }

    @Override
    public void add(Composite... comps) {
        for (Composite comp : comps) {
            array.add(comp);
        }
    }
    @Override
    public void remove(Composite... comps) {
        array.removeWithValues(comps);
    }
    @Override
    public Array<Composite> getComponentList() {
        return this.array;
    }
    @Override
    public void objectToString() {
        if (array.getSize() > 1) {
            System.out.println(this.getValue() + " Containing");
            objectToString(array, "\t");
        }
        else {
            System.out.println(this.getValue());
        }

    }
    public void objectToString(Array<Composite> dynArray, String indents) {
        if (array.getSize() > 1) {
            Composite[] arr = dynArray.getArray();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] instanceof ArrayComposite) {
                    ArrayComposite ac = ((ArrayComposite) arr[i]);
                    System.out.println(indents + ac.value + " Containing");
                    objectToString(ac.array, indents + "\t");
                }
                else if (arr[i] instanceof LinkedComposite) {
                    LinkedComposite lc = ((LinkedComposite) arr[i]);
                    if (lc.myList.getHead() != null) {
                        System.out.println(indents + lc.getValue() + " Containing");
                        lc.objectToString(lc.myList.getHead(), lc.myList, indents + "\t");
                    }
                    else {
                        System.out.println(lc.getValue());
                    }
                }
                else if (arr[i] instanceof InstanceComposite) {
                    InstanceComposite ic = ((InstanceComposite) arr[i]);
                    if (ic.variable != null) {
                        System.out.println(indents + ic.getValue() + " Containing");
                        ic.objectToString(ic.variable, indents + "\t");
                    }
                    else {
                        System.out.println(indents + this.getValue());
                    }
                }
                else if (arr[i] instanceof Leaf) {
                    Leaf leaf = ((Leaf) arr[i]);
                    System.out.println(indents + "Leaf " + leaf.value);
                }
            }
        }
    }

    @Override
    public Object getValue() {
        return value;
    }
}