package _02_InterfacecAndAbstractionEX._08_MilitaryElite.classes;

import _02_InterfacecAndAbstractionEX._08_MilitaryElite.interfaces.IEngineer;
import _02_InterfacecAndAbstractionEX._08_MilitaryElite.interfaces.IRepair;

import java.util.ArrayList;
import java.util.List;

public class Engineer extends SpecialisedSoldier implements IEngineer {
    private List<IRepair> repairs;

    public Engineer(int id, String firstName, String lastName, double salary, String corps, List<IRepair> repairs) {
        super(id, firstName, lastName, salary, corps);
        this.setRepairs(repairs);
    }

    private List<IRepair> getRepairs() {
        return this.repairs;
    }

    private void setRepairs(List<IRepair> repairs) {
        if(repairs.size() == 0){
            this.repairs = new ArrayList<>();
        } else {
            this.repairs = new ArrayList<>(repairs);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(String.format("Corps: %s", super.getCorps())).append(System.lineSeparator());
        sb.append("Repairs:").append(System.lineSeparator());
        for (IRepair currentRepair : this.getRepairs()) {
            sb.append(String.format("  %s", currentRepair.toString())).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
