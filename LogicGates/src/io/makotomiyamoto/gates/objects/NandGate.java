package io.makotomiyamoto.gates.objects;

public class NandGate extends LogicGate {

    public NandGate() {
        super();
    }

    public NandGate(boolean[] inputs) {
        super(inputs);
    }

    public NandGate(boolean input1, boolean input2) {
        super(input1, input2);
    }

    @Override
    public boolean getQuery() {
        return new AndGate(super.getInput1(), super.getInput2()).invertQuery();
    }

}
