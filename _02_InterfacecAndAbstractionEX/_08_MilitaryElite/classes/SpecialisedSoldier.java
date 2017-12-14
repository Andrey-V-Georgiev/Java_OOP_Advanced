package _02_InterfacecAndAbstractionEX._08_MilitaryElite.classes;

import _02_InterfacecAndAbstractionEX._08_MilitaryElite.interfaces.ISpecialisedSoldier;

public abstract class SpecialisedSoldier extends Private implements ISpecialisedSoldier {
    private String corps;

    public SpecialisedSoldier(int id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary);
        this.setCorps(corps);
    }

    protected String getCorps() {
        return this.corps;
    }

    private void setCorps(String corps) {
        this.corps = corps;
    }

    @Override
    public String toString() {
       return super.toString();
    }
}
