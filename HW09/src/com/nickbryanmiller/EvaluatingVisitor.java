package com.nickbryanmiller;

import java.util.ArrayList;

public class EvaluatingVisitor implements InterfaceVisitor {

    // We should keep a reference to what we are visiting
    private AbstractComponent ac;

    @Override
    public void visit(AbstractComponent comp) {
        this.ac = comp;
    }

    @Override
    public String toString() {
        return Double.toString(ac.evaluate());
    }

}

