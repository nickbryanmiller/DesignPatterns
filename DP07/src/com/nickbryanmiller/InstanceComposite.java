package com.nickbryanmiller;

// This is a ConcreteComposite that uses an instance variable as its composite list (max of 1 child)

public class InstanceComposite extends Composite {
    String value = "InstanceComposite";
    Composite variable;

    // Constructor that allows the option of adding composites during instantiation
    public InstanceComposite(Composite... comps) {
        this.value = "InstanceComposite";
        variable = null;
        add(comps);
    }

    // Uses varargs but only takes the first one to set to the instance variable
    @Override
    public void add(Composite... comps) {
        if (comps.length > 0) {
            variable = comps[0];
        }
    }

    // Removes the value of the instance variable by setting it to null
    @Override
    public void remove(Composite... comps) {
        if (comps.length > 0) {
            if (comps[0] == variable) {
                variable = null;
            }
        }
    }

    // Gets the variable associated with this particular composite type
    @Override
    public Composite getComponentList() {
        return this.variable;
    }

    // Utility function that uses the below recursive function to print out the tree structure
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

    // Goes through the entire tree and calls the appropriate string method after downcasting the composite
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

    // Grabs the name of this object
    @Override
    public Object getValue() {
        return this.value;
    }
}