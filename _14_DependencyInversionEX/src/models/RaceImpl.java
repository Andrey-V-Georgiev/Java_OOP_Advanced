package _14_DependencyInversionEX.src.models;

import _14_DependencyInversionEX.src.exeptions.DuplicateModelException;
import _14_DependencyInversionEX.src.models.boats.Boat;
import _14_DependencyInversionEX.src.utility.Constants;
import _14_DependencyInversionEX.src.utility.Validator;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RaceImpl implements _14_DependencyInversionEX.src.contracts.Race {
    private int distance;
    private int windSpeed;
    private int oceanCurrentSpeed;
    private boolean allowsMotorBoats;
    private Map<String, Boat> registeredBoats;


    public RaceImpl(int distance, int windSpeed, int oceanCurrentSpeed, Boolean allowsMotorBoats) {
        this.distance = distance;
        this.windSpeed = windSpeed;
        this.oceanCurrentSpeed = oceanCurrentSpeed;
        this.allowsMotorBoats = allowsMotorBoats;
        this.registeredBoats = new LinkedHashMap<>();
    }

    @Override
    public int getDistance() {
        return distance;
    }

    private void setDistance(int distance) {
        Validator.ValidatePropertyValue(distance, "Distance");
        this.distance = distance;
    }

    @Override
    public int getWindSpeed() {
        return windSpeed;
    }

    @Override
    public int getOceanCurrentSpeed() {
        return oceanCurrentSpeed;
    }

    @Override
    public boolean getAllowsMotorboats() {
        return allowsMotorBoats;
    }

    @Override
    public void addParticipant(Boat boat) throws DuplicateModelException {
        if (this.registeredBoats.containsKey(boat.getModel())) {
            throw new DuplicateModelException(Constants.DUPLICATE_MODEL_MESSAGE);
        }
        this.registeredBoats.put(boat.getModel(), boat);
    }

    @Override
    public List<Boat> getParticipants() {
        return new ArrayList<Boat>(this.registeredBoats.values());
    }
}