package com.nickbryanmiller;

public class InstanceComposite extends Composite {
    String value = "InstanceComposite";
    Composite variable;

    public InstanceComposite(Composite... comps) {
        this.value = "InstanceComposite";
        variable = null;
        add(comps);
    }

    @Override
    public void add(Composite... comps) {
        if (comps.length > 0) {
            variable = comps[0];
        }
    }
    @Override
    public void remove(Composite... comps) {
        if (comps.length > 0) {
            if (comps[0] == variable) {
                variable = null;
            }
        }
    }
    @Override
    public Composite getComponentList() {
        return this.variable;
    }
    @Override
    public void objectToString() {
        if (this.variable != null) {
            System.out.println(this.getValue() + " Containing");
            objectToString(variable, "\t");
        }
        else {
            System.out.println(this.getValue());
        }

    }
    public void objectToString(Composite var, String indents) {
        if (var != null) {
            if (var instanceof ArrayComposite) {
                ArrayComposite ac = ((ArrayComposite) var);
                System.out.println(indents + ac.value + " Containing");
                ac.objectToString(ac.array, indents + "\t");
            }
            else if (var instanceof LinkedComposite) {
                LinkedComposite lc = ((LinkedComposite) var);
                if (lc.myList.getHead() != null) {
                    System.out.println(indents + lc.getValue() + " Containing");
                    lc.objectToString(lc.myList.getHead(), lc.myList, indents + "\t");
                }
                else {
                    System.out.println(lc.getValue());
                }
            }
            else if (var instanceof InstanceComposite) {
                InstanceComposite ic = ((InstanceComposite) var);
                if (ic.variable != null) {
                    System.out.println(indents + this.getValue() + " Containing");
                    ic.objectToString(ic.variable, indents + "\t");
                }
                else {
                    System.out.println(indents + this.getValue());
                }
            }
            else if (var instanceof StaticArrayComposite) {
                StaticArrayComposite sac = ((StaticArrayComposite) var);
                System.out.println(indents + sac.value + " Containing");
                sac.objectToString(sac.array, indents + "\t");
            }
            else if (var instanceof Leaf) {
                Leaf leaf = ((Leaf) var);
                System.out.println(indents + "Leaf " + leaf.value);
            }
        }
    }

    @Override
    public Object getValue() {
        return this.value;
    }
}