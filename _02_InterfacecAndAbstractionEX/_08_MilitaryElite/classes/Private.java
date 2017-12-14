package _02_InterfacecAndAbstractionEX._08_MilitaryElite.classes;

import _02_InterfacecAndAbstractionEX._08_MilitaryElite.interfaces.IPrivate;

public class Private extends Soldier implements IPrivate {
    private double salary;

    public Private(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        this.setSalary(salary);
    }

    public double getSalary() {
        return this.salary;
    }

    private void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(String.format(" Salary: %.2f", this.getSalary())).append(System.lineSeparator());
        return sb.toString();
    }
}
