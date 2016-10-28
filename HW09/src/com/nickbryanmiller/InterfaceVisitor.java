package com.nickbryanmiller;

// Define a type that we can work with
public interface InterfaceVisitor {
    public void visit(AbstractComponent ac);
    public String toString();
}