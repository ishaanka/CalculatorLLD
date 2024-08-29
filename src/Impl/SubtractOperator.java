package Impl;

import Interface.INode;

public class SubtractOperator extends INode {
    INode leftOperand;
    INode rightOperand;

    public SubtractOperator(INode leftOperand, INode rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    @Override
    public double process() {
        return leftOperand.process() - rightOperand.process();
    }
}
