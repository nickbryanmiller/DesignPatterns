package com.nickbryanmiller;

// This is a ConcreteComposite that uses an instance variable as its composite list (max of 1 child)

public class InstanceComposite extends Composite {
    String value = "InstanceComposite";
    Composite variable;

    // Constructor that allows the option of adding composites during instantiation
    public InstanceComposite(Composite... comps) {
        this.value = "InstanceComposite";
        variable = null;
        addTM(comps);
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

    // Grabs the name of this object
    @Override
    public Object getValue() {
        return this.value;
    }
}