package _02_InterfacecAndAbstractionEX._08_MilitaryElite.classes;

import _02_InterfacecAndAbstractionEX._08_MilitaryElite.interfaces.ISpy;

public class Spy extends Soldier implements ISpy {
    private String codeNumber;

    public Spy(int id, String firstName, String lastName, String codeNumber) {
        super(id, firstName, lastName);
        this.setCodeNumber(codeNumber);
    }

    public String getCodeNumber() {
        return this.codeNumber;
    }

    private void setCodeNumber(String codeNumber) {
        this.codeNumber = codeNumber;
    }

    @Override
    public String toString() {
        //Code Number: <codeNumber>
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(System.lineSeparator());
        sb.append(String.format("Code Number: %s%n", this.getCodeNumber()));
        return sb.toString();
    }
}
