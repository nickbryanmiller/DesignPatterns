package com.nickbryanmiller;

// This acts as an abstract class for Leaf and Composite (Component Group)
// NOTE: The following methods are not abstract because we want to be
//       able to pass a leaf as a composite as well and they should not
//       have some implementations that the composites have

// Both our leaf and composite classes need these so that we can work with just one type

public abstract class Composite {
    // Sets the parent
    private Composite parent = null;
    MyIterator<Composite> it = null;

    // Is a method that adds and sets the parent
    public final void addTM(Composite... comps) {
        try {
            add(comps);
            // Set the parent
            for (int i = 0; i < comps.length; i++) {
                comps[i].parent = this;
            }
        }
        catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    public final void removeTM(Composite... comps) {
        try {
            remove(comps);
            // Set the parent
            for (int i = 0; i < comps.length; i++) {
                comps[i].parent = null;
            }
        }
        catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    // ------------------------ The methods the TM's calls ----------------------- //
    // Adds components
    protected void add(Composite... comps) { /* Do nothing by default */ }

    // Removes components
    protected void remove(Composite... comps) { /* Do nothing by default */ }

    // Gets components
    public Object getComponentList() { return null; }

    // Prints out information specific to the Leaf or Composite
    final public String objectToString() {
        String val = this.getStringValue();
        val = val + doToStringFunction("\t");
        return val;
    }
    private String doToStringFunction(String indents) {
        String val = "";
        makeIterator();
        while (it.isValid()) {
            Composite comp = it.getCurrent();
            val = val + indents + comp.getStringValue();
            val = val + comp.doToStringFunction(indents + "\t");
            it.next();
        }
        return val;
    }

    final public String objectToStringReverse() {
        String val = doToStringFunctionReverse("\t");
        val = val + this.getStringValue();
        return val;
    }
    private String doToStringFunctionReverse(String indents) {
        String val = "";
        makeIterator();
        while (it.isValid()) {
            Composite comp = it.getCurrent();
            val = val + comp.doToStringFunctionReverse(indents + "\t");
            val = val + indents + comp.getStringValue();
            it.next();
        }
        return val;
    }

    private String getStringValue() {
        return (parent == null)?
                getValue() + " is the root.\n":
                getValue() + " is the child of " + parent.getValue() + "\n";
    }

    // Gives the value the class or object holds
    public Object getValue() { return null; }

    // Get the parent
    protected Composite getParent() { return parent; }

    // Get the iterator
    final public MyIterator<Composite> makeIterator() {
        it = new CompositeIterator(this);
        return it;
    }

}