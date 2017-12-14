package _14_DependencyInversionEX.src.models.boats;

import _14_DependencyInversionEX.src.contracts.Race;
import _14_DependencyInversionEX.src.utility.Constants;
import _14_DependencyInversionEX.src.utility.Validator;

public abstract class BaseBoat implements Boat{
    private String model;
    private int weight;

    protected BaseBoat(String model, int weight) {
        this.setModel(model);
        this.setWeight(weight);
    }

    public String getModel() {
        return this.model;
    }

    private void setModel(String model) {
        Validator.ValidateModelLength(model, Constants.MIN_BOAT_MODEL_LENGTH);
        this.model = model;
    }

    public int getWeight() {
        return this.weight;
    }

    private void setWeight(int weight) {
        Validator.ValidatePropertyValue(weight, "Weight");
        this.weight = weight;
    }
}
