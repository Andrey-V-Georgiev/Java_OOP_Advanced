package _13_DependencyInversionLAB.src.p05_security_system.implementations;

import _13_DependencyInversionLAB.src.p05_security_system.interfaces.KeyCardUI;
import _13_DependencyInversionLAB.src.p05_security_system.interfaces.PinCodeUI;

public class KeyCardCheck extends SecurityCheck implements KeyCardUI{

    private PinCodeUI securityUI;

    public KeyCardCheck(PinCodeUI securityUI) {
        this.securityUI = securityUI;
    }

    private boolean isValid(String code) {
        return true;
    }

    @Override
    public String requestKeyCard() {
        return "slide your card";
    }
}
