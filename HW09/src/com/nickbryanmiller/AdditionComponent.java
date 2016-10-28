package com.nickbryanmiller;

public class AdditionComponent extends AbstractComponent {

    public AdditionComponent(AbstractComponent... comps) {
        add(comps);
    }

    @Override
    public double doEvaluate() {
        double val = 0;
        for(AbstractComponent comp : this.getChildren()){
            val = val + comp.evaluate();
        }
        return val;
    }

    @Override
    public String toString() {
        return "+";
    }
}