package io.makotomiyamoto.gates.objects;

public abstract class LogicGate {

    /**
     * Value of first input.
     */

    private boolean input1;

    /**
     * Value of second input.
     */

    private boolean input2;

    /**
     * When instantiated with the default
     * constructor, both inputs are false
     * by default.
     */

    public LogicGate() {
        this.input1 = false;
        this.input2 = false;
    }

    /**
     * A logic gate constructed from an array
     * of inputs by reading the first
     * two items in that list.
     *
     * @param inputs an array of inputs
     */

    public LogicGate(boolean[] inputs) {
        this.input1 = inputs[0];
        this.input2 = inputs[1];
    }

    /**
     * A logic gate constructed from
     * two defined inputs.
     *
     * @param input1 the first input
     * @param input2 the second input
     */

    public LogicGate(boolean input1, boolean input2) {
        this.input1 = input1;
        this.input2 = input2;
    }

    /**
     * Returns the value of the first input.
     *
     * @return the value of the first input
     */

    public boolean getInput1() {
        return input1;
    }

    /**
     * Sets the value of the first input to
     * the first item from a Boolean array.
     *
     * @param inputs an array of inputs
     */

    public void setInput1(boolean[] inputs) {
        if (inputs.length < 1) {
            this.input1 = false;
            return;
        }
        this.input1 = inputs[0];
    }

    /**
     * Sets the value of the first input
     *
     *
     * @param input a boolean input
     */

    public void setInput1(boolean input) {
        this.input1 = input;
    }

    /**
     * Returns the value of the second input.
     *
     * @return the value of the second input
     */

    public boolean getInput2() {
        return input2;
    }

    /**
     * Sets the value of the second input to
     * the second item in an array of inputs.
     *
     * @param inputs an array of inputs
     */

    public void setInput2(boolean[] inputs) {
        if (inputs.length < 2) {
            this.input2 = false;
            return;
        }
        this.input2 = inputs[1];
    }

    /**
     * Sets the value of the second input.
     *
     * @param input a boolean input
     */

    public void setInput2(boolean input) {
        this.input2 = input;
    }

    /**
     * Inverts the output of a logic gate.
     *
     * @return inverse of the output value
     */

    public boolean invertQuery() {
        return !getQuery();
    }

    /**
     * Abstract getQuery(), meant to be
     * overridden in child classes.
     *
     * @return logic gate output
     */

    public abstract boolean getQuery();

    /**
     * Writes a formatted logic gate
     * test result that can be easily
     * read and understood.
     *
     * @return a formatted simulation referral
     */

    public String toString() {

        return this.getClass().getSimpleName() + "\nInput1: " + input1 + "\nInput2: " + input2 +
                "\nQuery:  " + getQuery() + "\n";

    }

}
