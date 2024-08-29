package Impl;

import Interface.INode;

public class Operand extends INode {
    double val;

    public Operand(double val) {
        this.val = val;
    }

    @Override
    public double process() {
        return val;
    }
}
