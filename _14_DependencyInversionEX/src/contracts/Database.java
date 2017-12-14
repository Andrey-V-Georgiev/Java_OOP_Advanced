package _14_DependencyInversionEX.src.contracts;

import _14_DependencyInversionEX.src.models.boats.Boat;

public interface Database {
    CrudRepository<Boat> getBoats();

    CrudRepository<BoatEngine> getEngines();
}
