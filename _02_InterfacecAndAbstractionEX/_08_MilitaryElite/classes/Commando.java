package _02_InterfacecAndAbstractionEX._08_MilitaryElite.classes;

import _02_InterfacecAndAbstractionEX._08_MilitaryElite.interfaces.ICommando;
import _02_InterfacecAndAbstractionEX._08_MilitaryElite.interfaces.IMission;

import java.util.ArrayList;
import java.util.List;

public class Commando extends SpecialisedSoldier implements ICommando {
    private List<IMission> missions;

    public Commando(int id, String firstName, String lastName, double salary, String corps, List<IMission> missions) {
        super(id, firstName, lastName, salary, corps);
        this.missions = missions;
    }

    private List<IMission> getMissions() {
        return this.missions;
    }

    private void setMissions(List<IMission> missions) {
       if(missions.size() == 0){
           this.missions = new ArrayList<>();
       } else {
           this.missions = new ArrayList<>(missions);
       }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(String.format("Corps: %s", super.getCorps())).append(System.lineSeparator());
        sb.append("Missions:").append(System.lineSeparator());
        for (IMission currentMission : this.getMissions()) {
            sb.append(String.format("  %s", currentMission.toString())).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
