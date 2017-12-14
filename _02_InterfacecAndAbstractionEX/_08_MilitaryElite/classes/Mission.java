package _02_InterfacecAndAbstractionEX._08_MilitaryElite.classes;

import _02_InterfacecAndAbstractionEX._08_MilitaryElite.interfaces.IMission;

public class Mission implements IMission {
    private String codeName;
    private String state;

    public Mission(String codeName, String state) {
        this.codeName = codeName;
        this.state = state;
    }

    private String getCodeName() {
        return this.codeName;
    }

    private String getState() {
        return this.state;
    }

    private void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    private void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return String.format("Code Name: %s State: %s", this.getCodeName(), this.getState());
    }
}
