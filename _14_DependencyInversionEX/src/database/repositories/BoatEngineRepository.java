package _14_DependencyInversionEX.src.database.repositories;

import _14_DependencyInversionEX.src.contracts.BoatEngine;
import _14_DependencyInversionEX.src.contracts.CrudRepository;
import _14_DependencyInversionEX.src.exeptions.DuplicateModelException;
import _14_DependencyInversionEX.src.exeptions.NonExistantModelException;
import _14_DependencyInversionEX.src.utility.Constants;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class BoatEngineRepository implements CrudRepository<BoatEngine> {
    private Map<String, BoatEngine> boatEngines;

    public BoatEngineRepository() {
        this.boatEngines = new LinkedHashMap<>();
    }

    @Override
    public Map<String, BoatEngine> getBoatEngines() {
        return Collections.unmodifiableMap(this.boatEngines);
    }

    @Override
    public BoatEngine findByModel(String model) throws NonExistantModelException {
        if (!this.boatEngines.containsKey(model)) {
            throw new NonExistantModelException(Constants.NON_EXISTENT_MODEL_MESSAGE);
        }

        return this.boatEngines.get(model);
    }

    @Override
    public void add(BoatEngine item) throws DuplicateModelException {
        if (this.boatEngines.containsKey(item.getModel())) {
            throw new DuplicateModelException(Constants.DUPLICATE_MODEL_MESSAGE);
        }
    }
}
