package com.nickbryanmiller;

public class LeafComponent extends AbstractComponent {

    private float val;

    public LeafComponent(float v) {
        this.val = v;
    }

    @Override
    public float doEvaluate() {
        return val;
    }

    @Override
    public String toString() {
        return Float.toString(val);
    }
}