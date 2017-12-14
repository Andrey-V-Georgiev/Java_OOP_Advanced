package _16_ObjectCommunicationEX._04_WorkForce.eployees;

import _16_ObjectCommunicationEX._04_WorkForce.interfaces.Employee;

public abstract class AbstractEmployee implements Employee {
    private String name;
    private int weekHours;

    public AbstractEmployee(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getWeekHours() {
        return this.weekHours;
    }

    protected void setWeekHours(int weekHours){
        this.weekHours = weekHours;
    }
}
