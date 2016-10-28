package com.nickbryanmiller;

import java.util.ArrayList;

public abstract class AbstractComponent {

    // Keep a reference to the parent
    private AbstractComponent parent = null;
    // They will all use the same type of list for simplicity
    private ArrayList<AbstractComponent> children = new ArrayList<AbstractComponent>();

    // Adds and sets the parent by Template Method
    public final void add(AbstractComponent... comps) {
        try {
            doAdd(comps);
            // Set the parent
            for (int i = 0; i < comps.length; i++) {
                comps[i].parent = this;
            }
        }
        catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
    // Adds components
    protected void doAdd(AbstractComponent... comps) {
        for (AbstractComponent comp : comps) {
            children.add(comp);
        }
    }

    // removes and nulls the parent by Template Method
    public final void remove(AbstractComponent... comps) {
        try {
            doRemove(comps);
            // Null the parent
            for (int i = 0; i < comps.length; i++) {
                comps[i].parent = null;
            }
        }
        catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
    // Removes components
    protected void doRemove(AbstractComponent... comps) {
        for (AbstractComponent comp : comps) {
            children.remove(comp);
        }
    }

    // Gets components
    public ArrayList<AbstractComponent> getChildren() { return this.children; }

    // Get the parent
    protected AbstractComponent getParent() { return parent; }

    // Evaluates the tree by Template Method
    public final float evaluate(){
        // Do anything else you want
        return doEvaluate();
    }

    /*
    // Accept function for visitor to visit the AbstractComponents
    public void acceptVisitor(ArithmeticVisitor visitor){
        visitor.visit(this);
    }
    */

    // Abstract methods for getting string representation and the evaluation
    public abstract String toString();
    public abstract float doEvaluate();

}