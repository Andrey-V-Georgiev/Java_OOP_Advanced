package _13_DependencyInversionLAB.src.p04_recharge.implementations;

import _13_DependencyInversionLAB.src.p04_recharge.interfaces.Rechargeable;

public class RobotAdapter extends Robot implements Rechargeable{

    public RobotAdapter(String id, int capacity) {
        super(id, capacity);
    }

    @Override
    public void recharge() {

    }
}
