package com.nickbryanmiller;

public class DivisionComponent extends AbstractComponent {

    public DivisionComponent(AbstractComponent... comps) {
        add(comps);
    }

    @Override
    public double doEvaluate() {
        double val = this.getChildren().get(0).evaluate();
        for(int i = 1; i < this.getChildren().size(); i++){
            val = val / this.getChildren().get(i).evaluate();
        }
        return val;
    }

    @Override
    public String toString() {
        return "/";
    }
}