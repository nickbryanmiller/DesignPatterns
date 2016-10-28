package com.nickbryanmiller;

public class MultiplicationComponent extends AbstractComponent {

    public MultiplicationComponent(AbstractComponent... comps) {
        add(comps);
    }

    @Override
    public double doEvaluate() {
        double val = 1;
        for(AbstractComponent comp : this.getChildren()){
            val = val * comp.evaluate();
        }
        return val;
    }

    @Override
    public String toString() {
        return "*";
    }
}