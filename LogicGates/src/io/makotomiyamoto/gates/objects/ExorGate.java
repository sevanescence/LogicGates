package io.makotomiyamoto.gates.objects;

public class ExorGate extends LogicGate {

    public ExorGate() {
        super();
    }

    public ExorGate(boolean[] inputs) {
        super(inputs);
    }

    public ExorGate(boolean input1, boolean input2) {
        super(input1, input2);
    }

    @Override
    public boolean getQuery() {
        return (!super.getInput1() && super.getInput2() || super.getInput1() && !super.getInput2());
    }

}
