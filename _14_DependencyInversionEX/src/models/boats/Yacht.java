package _14_DependencyInversionEX.src.models.boats;

import _14_DependencyInversionEX.src.contracts.BoatEngine;
import _14_DependencyInversionEX.src.contracts.Race;
import _14_DependencyInversionEX.src.utility.Validator;

public class Yacht extends BaseBoat {
    private BoatEngine engine;
    private int cargoWeight;

    protected Yacht(String model, int weight, BoatEngine engine, int cargoWeight) {
        super(model, weight);
        this.engine = engine;
        this.setCargoWeight(cargoWeight);
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    private void setCargoWeight(int cargoWeight) {
        Validator.ValidatePropertyValue(cargoWeight, "Cargo Weight");
        this.cargoWeight = cargoWeight;
    }

    @Override
    public double calculateRaceSpeed(Race race) {

        return this.engine.getCachedOutput() - (super.getWeight() + this.cargoWeight)
                + (race.getOceanCurrentSpeed() / 2d);
    }
}
