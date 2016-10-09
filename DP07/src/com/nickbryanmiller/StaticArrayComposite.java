package com.nickbryanmiller;

public class StaticArrayComposite extends Composite {
    String value = "StaticArrayComposite";
    Composite[] array;

    public StaticArrayComposite(int size, Composite... comps) {
        this.value = "StaticArrayComposite";
        array = new Composite[size];
        add(comps);
    }

    @Override
    public void add(Composite... comps) {
        for (int i = 0; i < comps.length && i < array.length; i++) {
            if (array[i] == null) {
                array[i] = comps[i];
            }
        }
    }
    public int getIndexOf(Composite[] compArray, Composite c) {
        for (int i = 0; i < compArray.length; i++) {
            if (compArray[i] == c) {
                return i;
            }
        }

        return -1;
    }
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
    @Override
    public Composite[] getComponentList() {
        return this.array;
    }
    @Override
    public void objectToString() {
        if (array.length >= 1) {
            System.out.println(this.getValue() + " Containing");
            objectToString(array, "\t");
        }
        else {
            System.out.println(this.getValue());
        }
    }
    // Input parameter gets chan
    public void objectToString(Composite[] arr, String indents) {
        if (array.length >= 1) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != null) {
                    if (arr[i] instanceof ArrayComposite) {
                        ArrayComposite ac = ((ArrayComposite) arr[i]);
                        System.out.println(indents + ac.value + " Containing");
                        ac.objectToString(ac.array, indents + "\t");
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
                    else if (arr[i] instanceof StaticArrayComposite) {
                        StaticArrayComposite sac = ((StaticArrayComposite) arr[i]);
                        System.out.println(indents + sac.value + " Containing");
                        sac.objectToString(sac.array, indents + "\t");
                    }
                    else if (arr[i] instanceof Leaf) {
                        Leaf leaf = ((Leaf) arr[i]);
                        System.out.println(indents + "Leaf " + leaf.value);
                    }
                }
            }
        }
    }

    @Override
    public Object getValue() {
        return value;
    }
}