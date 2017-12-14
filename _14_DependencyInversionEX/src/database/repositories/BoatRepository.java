package _14_DependencyInversionEX.src.database.repositories;

import _14_DependencyInversionEX.src.contracts.BoatEngine;
import _14_DependencyInversionEX.src.contracts.CrudRepository;
import _14_DependencyInversionEX.src.exeptions.DuplicateModelException;
import _14_DependencyInversionEX.src.exeptions.NonExistantModelException;
import _14_DependencyInversionEX.src.models.boats.Boat;
import _14_DependencyInversionEX.src.utility.Constants;

import java.util.LinkedHashMap;
import java.util.Map;


public class BoatRepository implements CrudRepository<Boat> {
    private Map<String, Boat> boats;

    public BoatRepository() {
        this.boats = new LinkedHashMap<>();
    }

    @Override
    public Map<String, BoatEngine> getBoatEngines() {
        return null;
    }

    @Override
    public Boat findByModel(String model) throws NonExistantModelException {
        if (!this.boats.containsKey(model)) {
            throw new NonExistantModelException(Constants.NON_EXISTENT_MODEL_MESSAGE);
        }

        return this.boats.get(model);
    }

    @Override
    public void add(Boat item) throws DuplicateModelException {
        if (this.boats.containsKey(item.getModel())) {
            throw new DuplicateModelException(Constants.DUPLICATE_MODEL_MESSAGE);
        }
    }
}
