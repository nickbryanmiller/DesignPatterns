package com.nickbryanmiller;

public class MultiplicationComponent extends AbstractComponent {

    public MultiplicationComponent(AbstractComponent... comps) {
        add(comps);
    }

    @Override
    public float doEvaluate() {
        float val = 1;
        for(AbstractComponent child : this.getChildren()){
            val = val * child.evaluate();
        }
        return val;
    }

    @Override
    public String toString() {
        return "*";
    }
}