package _02_InterfacecAndAbstractionEX._03_Ferrari;

public class Ferrari implements Car{
    private String driverName;
    private final String MODEL = "488-Spider";
    private final String BREAKS = "Brakes!";
    private final String GAS = "Zadu6avam sA!";

    public Ferrari(String driverName) {
        this.driverName = driverName;
    }

    @Override
    public String toString(){
        return String.format("%s/%s/%s/%s",this.MODEL, this.BREAKS, this.GAS, this.driverName);
    }
}
