package _13_DependencyInversionLAB.src.p05_security_system.implementations;

import _13_DependencyInversionLAB.src.p05_security_system.interfaces.PinCodeUI;

public class PinCodeCheck extends SecurityCheck implements PinCodeUI{

    private PinCodeUI securityUI;

    public PinCodeCheck(PinCodeUI securityUI) {
        this.securityUI = securityUI;
    }

    private boolean isValid(int pin) {
        return true;
    }

    @Override
    public int requestPinCode() {
        return 0;
    }
}
