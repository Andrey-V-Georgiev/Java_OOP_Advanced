package _16_ObjectCommunicationEX._02_KingsGambit_05_Extended.classes;

import _16_ObjectCommunicationEX._02_KingsGambit_05_Extended.intefaces.Unit;


public class King {
    private String name;
    private CustomArrayList units;

    public King(String name, CustomArrayList units) {
        this.name = name;
        this.units = units;
    }

    public void attacked(){
        System.out.println(String.format("King %s is under attack!", this.name));
        this.units.stream().filter(x->x.getType().equalsIgnoreCase("guard")).forEach(Unit::attacked);
        this.units.stream().filter(x->x.getType().equalsIgnoreCase("footman")).forEach(Unit::attacked);

    }

    public void killUnit(String name){
        Unit unitForKill = null;
        for (Unit unit : this.units) {
            if(unit.getName().equalsIgnoreCase(name)){
                unitForKill = unit;
            }
        }
        this.units.removeUnit(unitForKill);
    }
}
