package com.nickbryanmiller;

public class AdditionComponent extends AbstractComponent {

    public AdditionComponent(AbstractComponent... comps) {
        add(comps);
    }

    @Override
    public float doEvaluate() {
        float val = 0;
        for(AbstractComponent child : this.getChildren()){
            val = val + child.evaluate();
        }
        return val;
    }

    @Override
    public String toString() {
        return "+";
    }
}