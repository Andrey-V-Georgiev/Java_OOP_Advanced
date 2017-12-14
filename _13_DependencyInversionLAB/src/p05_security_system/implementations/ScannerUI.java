package _13_DependencyInversionLAB.src.p05_security_system.implementations;

import _13_DependencyInversionLAB.src.p05_security_system.interfaces.KeyCardUI;
import _13_DependencyInversionLAB.src.p05_security_system.interfaces.PinCodeUI;

import java.util.Scanner;

public class ScannerUI implements PinCodeUI, KeyCardUI {

    private Scanner scanner;

    public ScannerUI() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public String requestKeyCard() {
        System.out.println("slide your key card");
        return this.scanner.nextLine();
    }

    @Override
    public int requestPinCode() {
        System.out.println("enter your pin code");
        return Integer.parseInt(this.scanner.nextLine());
    }
}
