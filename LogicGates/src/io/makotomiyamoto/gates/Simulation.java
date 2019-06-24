package io.makotomiyamoto.gates;

import io.makotomiyamoto.gates.objects.*;

public class Simulation {

    public static void main(String[] args) {

        System.out.println("This is a Logic Gate simulation.\n");

        boolean[] inputs = {true, true};

        System.out.println(new AndGate(inputs).getQuery()); // true
        System.out.println(new NandGate(inputs).getQuery()); // false
        System.out.println(new OrGate(inputs).getQuery()); // true
        System.out.println(new NorGate(inputs).getQuery()); // false
        System.out.println(new ExorGate(inputs).getQuery()); // false
        System.out.println(new ExNorGate(inputs).getQuery()); // true

    }

}
