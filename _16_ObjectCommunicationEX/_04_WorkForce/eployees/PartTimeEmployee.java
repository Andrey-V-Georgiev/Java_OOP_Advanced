package _16_ObjectCommunicationEX._04_WorkForce.eployees;

public class PartTimeEmployee extends AbstractEmployee {
    public PartTimeEmployee(String name) {
        super(name);
        super.setWeekHours(20);
    }

}
