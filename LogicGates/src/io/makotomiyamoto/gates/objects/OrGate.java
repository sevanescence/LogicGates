package io.makotomiyamoto.gates.objects;

public class OrGate extends LogicGate {

    public OrGate() {
        super();
    }

    public OrGate(boolean[] inputs) {
        super(inputs);
    }

    public OrGate(boolean input1, boolean input2) {
        super(input1, input2);
    }

    @Override
    public boolean getQuery() {
        return (super.getInput1() || super.getInput2());
    }



}
