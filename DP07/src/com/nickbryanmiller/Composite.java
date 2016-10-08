package com.nickbryanmiller;

// This acts as an abstract class for Leaf and Composite (Component Group)
// NOTE: The following methods are not abstract because we want to be
//       able to pass a leaf as a composite as well and they should not
//       have some implementations that the composites have

public abstract class Composite {
    // Adds components
    public void add(Composite comp) { /* Do nothing by default */ }

    // Removes components
    public void remove(Composite comp) { /* Do nothing by default */ }

    // Gets components
    public Object getComponentList() { return null; }

    // Prints out information specific to the Leaf or Composite
    public void objectToString() { /* Do nothing by default */ }

    // Gives the value the class or object holds
    public Object getValue() { return null; }
}