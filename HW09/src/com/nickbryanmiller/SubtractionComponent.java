package com.nickbryanmiller;

public class SubtractionComponent extends AbstractComponent {

    public SubtractionComponent(AbstractComponent... comps) {
        add(comps);
    }

    @Override
    public double doEvaluate() {
        double val = 0;

        // If you just want to subtract one number because it is our only child
        if(this.getChildren().size() == 1){
            val = -1 * this.getChildren().get(0).evaluate();
        }
        else { // we have multiple things to subtract
            val = this.getChildren().get(0).evaluate();
        }

        for(int i = 1; i < this.getChildren().size(); i++){
            val = val - this.getChildren().get(i).evaluate();
        }
        return val;

    }

    @Override
    public String toString() {
        return "-";
    }
}