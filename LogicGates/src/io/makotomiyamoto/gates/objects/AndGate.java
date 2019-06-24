package io.makotomiyamoto.gates.objects;

public class AndGate extends LogicGate {

    /**
     * When instantiated with the default
     * constructor, both inputs are false
     * by default.
     */

    public AndGate() {
        super();
    }

    /**
     * A logic gate constructed from an array
     * of inputs by reading the first
     * two items in that list.
     *
     * @param inputs an array of inputs
     */

    public AndGate(boolean[] inputs) {
        super(inputs);
    }

    /**
     * A logic gate constructed from
     * two defined inputs.
     *
     * @param input1 the first input
     * @param input2 the second input
     */

    public AndGate(boolean input1, boolean input2) {
        super(input1, input2);
    }

    /**
     * AndGate getQuery() returns true when
     * both inputs are true.
     *
     * @return logic gate output
     */

    @Override
    public boolean getQuery() {
        return (super.getInput1() && super.getInput2());
    }

}
