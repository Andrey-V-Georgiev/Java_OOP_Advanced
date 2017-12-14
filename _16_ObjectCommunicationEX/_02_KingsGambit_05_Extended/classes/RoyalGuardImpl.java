package _16_ObjectCommunicationEX._02_KingsGambit_05_Extended.classes;

import _16_ObjectCommunicationEX._02_KingsGambit_05_Extended.intefaces.Unit;

public class RoyalGuardImpl implements Unit {
    private String name;
    private String type;
    private int blood;

    public RoyalGuardImpl(String name) {
        this.name = name;
        this.type = "guard";
        this.blood = 3;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean isDead(){
        this.blood--;
        return this.blood <= 0;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public void attacked() {
        System.out.println(String.format("Royal Guard %s is defending!", this.name));
    }
}
