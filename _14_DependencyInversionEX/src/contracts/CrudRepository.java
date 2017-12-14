package _14_DependencyInversionEX.src.contracts;

import _14_DependencyInversionEX.src.exeptions.DuplicateModelException;
import _14_DependencyInversionEX.src.exeptions.NonExistantModelException;

import java.util.Map;

public interface CrudRepository<T extends Modelable> {

    Map<String, BoatEngine> getBoatEngines();

    T findByModel(String  model) throws NonExistantModelException;

    void add(T item) throws DuplicateModelException;
}
