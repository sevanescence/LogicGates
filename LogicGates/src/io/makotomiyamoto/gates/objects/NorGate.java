package io.makotomiyamoto.gates.objects;

public class NorGate extends LogicGate {

    public NorGate() {
        super();
    }

    public NorGate(boolean[] inputs) {
        super(inputs);
    }

    public NorGate(boolean input1, boolean input2) {
        super (input1, input2);
    }

    @Override
    public boolean getQuery() {
        return new OrGate(super.getInput1(), super.getInput2()).invertQuery();
    }

}
