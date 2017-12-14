package _13_DependencyInversionLAB.src.p04_recharge.implementations;

import _13_DependencyInversionLAB.src.p04_recharge.interfaces.Rechargeable;

public class RechargeStation {

    public void recharge(Rechargeable rechargeable) {
        rechargeable.recharge();
    }
}
