package _13_DependencyInversionLAB.src.p04_recharge.implementations;

import _13_DependencyInversionLAB.src.p04_recharge.interfaces.Sleeper;

public class Employee extends Worker implements Sleeper {

    public Employee(String id) {
        super(id);
    }

    public void sleep() {
        // sleep...
    }
}
