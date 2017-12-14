package _14_DependencyInversionEX.src.database;

import _14_DependencyInversionEX.src.contracts.BoatEngine;
import _14_DependencyInversionEX.src.contracts.CrudRepository;
import _14_DependencyInversionEX.src.contracts.Database;
import _14_DependencyInversionEX.src.models.boats.Boat;

public class BoatSimulatorDatabase implements Database{
    private CrudRepository<Boat> boats;
    private CrudRepository<BoatEngine> engines;

    public BoatSimulatorDatabase(CrudRepository<Boat> boats, CrudRepository<BoatEngine> engines) {
        this.boats = boats;
        this.engines = engines;
    }

    @Override
    public CrudRepository<Boat> getBoats() {
        return this.boats;
    }

    @Override
    public CrudRepository<BoatEngine> getEngines() {
        return this.engines;
    }
}
