package _14_DependencyInversionEX.src.contracts;

import _14_DependencyInversionEX.src.exeptions.*;
import jdk.jshell.spi.ExecutionControl;

import java.util.List;

public interface CommandHandler {
    String executeCommand(String name, List<String> parameters)
            throws DuplicateModelException, NonExistantModelException,
            RaceAlreadyExistsException, NoSetRaceException,
            InsufficientContestantsException, ExecutionControl.NotImplementedException;
}
