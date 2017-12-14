package _02_InterfacecAndAbstractionEX._08_MilitaryElite.classes;

import _02_InterfacecAndAbstractionEX._08_MilitaryElite.interfaces.IRepair;

public class Repair implements IRepair {
    private String partName;
    private int hoursWorked;

    public Repair(String partName, int hoursWorked) {
        this.setPartName(partName);
        this.setHoursWorked(hoursWorked);
    }

    private String getPartName() {
        return this.partName;
    }

    private int getHoursWorked() {
        return this.hoursWorked;
    }

    private void setPartName(String partName) {
        this.partName = partName;
    }

    private void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
       return String.format("Part Name: %s Hours Worked: %d", this.getPartName(), this.getHoursWorked());
    }
}
