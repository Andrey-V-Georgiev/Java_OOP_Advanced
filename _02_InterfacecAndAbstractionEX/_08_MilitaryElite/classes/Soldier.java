package _02_InterfacecAndAbstractionEX._08_MilitaryElite.classes;

import _02_InterfacecAndAbstractionEX._08_MilitaryElite.interfaces.ISoldier;

public class Soldier implements ISoldier {
    //id, first name and last name.
    private int id;
    private String firstName;
    private String lastName;

    public Soldier(int id, String firstName, String lastName) {
        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    public int getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s Id: %d",
                 this.getFirstName(), this.getLastName(), this.getId());
    }
}
