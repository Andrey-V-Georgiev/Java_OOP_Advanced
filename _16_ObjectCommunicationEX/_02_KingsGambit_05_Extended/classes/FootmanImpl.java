package _16_ObjectCommunicationEX._02_KingsGambit_05_Extended.classes;


import _16_ObjectCommunicationEX._02_KingsGambit_05_Extended.intefaces.Unit;

public class FootmanImpl implements Unit {
    private String name;
    private String type;
    private int blood;

    public FootmanImpl(String name) {
        this.name = name;
        this.type = "footman";
        this.blood = 2;
    }

    @Override
    public boolean isDead(){
        this.blood--;
        return this.blood <= 0;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public void attacked() {
        System.out.println(String.format("Footman %s is panicking!", this.name));
    }
}
