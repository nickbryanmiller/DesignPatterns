package com.nickbryanmiller;

import java.util.DoubleSummaryStatistics;

public class LeafComponent extends AbstractComponent {

    private double val;

    public LeafComponent(float v) {
        this.val = v;
    }

    @Override
    public double doEvaluate() {
        return val;
    }

    @Override
    public String toString() {
        return Double.toString(val);
    }
}