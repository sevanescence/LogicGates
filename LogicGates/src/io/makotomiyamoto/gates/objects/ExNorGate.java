package io.makotomiyamoto.gates.objects;

public class ExNorGate extends LogicGate {

    /**
     * When instantiated with the default
     * constructor, both inputs are false
     * by default.
     */

    public ExNorGate() {
        super();
    }

    /**
     * A logic gate constructed from an array
     * of inputs by reading the first
     * two items in that list.
     *
     * @param inputs an array of inputs
     */

    public ExNorGate(boolean[] inputs) {
        super(inputs);
    }

    /**
     * A logic gate constructed from
     * two defined inputs.
     *
     * @param input1 the first input
     * @param input2 the second input
     */

    public ExNorGate(boolean input1, boolean input2) {
        super(input1, input2);
    }

    /**
     * ExorGate getQuery() returns true when
     * either input is true, but not both or
     * neither.
     *
     * @return logic gate output
     */

    @Override
    public boolean getQuery() {
        return new ExorGate(this.getInput1(), this.getInput2()).invertQuery();
    }

}
