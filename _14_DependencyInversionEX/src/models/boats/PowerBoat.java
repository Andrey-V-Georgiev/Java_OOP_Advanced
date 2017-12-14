package _14_DependencyInversionEX.src.models.boats;

import _14_DependencyInversionEX.src.contracts.BoatEngine;
import _14_DependencyInversionEX.src.contracts.Race;

public class PowerBoat extends  BaseBoat {
    private BoatEngine firstEngine;
    private BoatEngine secondEngine;

    protected PowerBoat(String model, int weight, BoatEngine firstEngine, BoatEngine secondEngine) {
        super(model, weight);
        this.firstEngine = firstEngine;
        this.secondEngine = secondEngine;
    }

    @Override
    public double calculateRaceSpeed(Race race) {
        return (this.firstEngine.getCachedOutput() + this.secondEngine.getCachedOutput()) - super.getWeight() + (race.getOceanCurrentSpeed() / 5d);
    }
}
