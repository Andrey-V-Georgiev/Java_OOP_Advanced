package _14_DependencyInversionEX.src.contracts;

import _14_DependencyInversionEX.src.exeptions.*;

public interface Executable {
    String execute() throws DuplicateModelException, NonExistantModelException, RaceAlreadyExistsException,
            NoSetRaceException, InsufficientContestantsException;
}
