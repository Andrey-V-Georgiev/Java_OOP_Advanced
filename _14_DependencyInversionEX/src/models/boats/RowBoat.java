package _14_DependencyInversionEX.src.models.boats;

import _14_DependencyInversionEX.src.contracts.Race;
import _14_DependencyInversionEX.src.utility.Validator;

public class RowBoat extends BaseBoat {
    private int oars;

    protected RowBoat(String model, int weight, int oars) {
        super(model, weight);
        this.setOars(oars);
    }

    public int getOars() {
        return oars;
    }

    public void setOars(int oars) {
        Validator.ValidatePropertyValue(oars, "Oars");
        this.oars = oars;
    }

    @Override
    public double calculateRaceSpeed(Race race) {
        return (this.oars * 100) - super.getWeight() + race.getOceanCurrentSpeed();
    }
}
