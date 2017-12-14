package _14_DependencyInversionEX.src.models.boat_engines;

import _14_DependencyInversionEX.src.contracts.BoatEngine;
import _14_DependencyInversionEX.src.utility.Constants;
import _14_DependencyInversionEX.src.utility.Validator;

public abstract class BaseBoatEngine implements BoatEngine {
    private String model;
    private int cachedOutput;

    protected BaseBoatEngine(String model, int horsepower, int displacement) {
        this.setModel(model);
        this.validateHorsepower(horsepower);
        this.validateDisplacement(displacement);
        this.cachedOutput =  this.calculateCachedOutput(horsepower, displacement);
    }

    protected abstract int calculateCachedOutput(int horsepower, int displacement);

    @Override
    public int getCachedOutput() {
        return this.cachedOutput;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    private void setModel(String model) {
        Validator.ValidateModelLength(model, Constants.MIN_BOAT_ENGINE_MODEL_LENGTH);
        this.model = model;
    }

    private void validateHorsepower(int horsepower) {
        Validator.ValidatePropertyValue(horsepower, "Horsepower");
    }


    private void validateDisplacement(int displacement) {
        Validator.ValidatePropertyValue(displacement, "Displacement");
    }
}
