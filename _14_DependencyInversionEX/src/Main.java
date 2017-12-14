package _14_DependencyInversionEX.src;

import _14_DependencyInversionEX.src.contracts.*;
import _14_DependencyInversionEX.src.contracts.Runnable;
import _14_DependencyInversionEX.src.controllers.BoatSimulatorControllerImpl;
import _14_DependencyInversionEX.src.core.CommandHandlerImpl;
import _14_DependencyInversionEX.src.engines.Engine;
import _14_DependencyInversionEX.src.database.BoatSimulatorDatabase;
import _14_DependencyInversionEX.src.database.repositories.BoatEngineRepository;
import _14_DependencyInversionEX.src.database.repositories.BoatRepository;
import _14_DependencyInversionEX.src.io.ConsoleInputReader;
import _14_DependencyInversionEX.src.io.ConsoleOutputWriter;
import _14_DependencyInversionEX.src.models.boats.Boat;

public class Main {
    public static void main(String[] args) {
        InputReader reader = new ConsoleInputReader();
        OutputWriter writer = new ConsoleOutputWriter();
        CrudRepository<Boat> boatCrudRepository = new BoatRepository();
        CrudRepository<BoatEngine> boatEngineCrudRepository = new BoatEngineRepository();
        Database database = new BoatSimulatorDatabase(boatCrudRepository, boatEngineCrudRepository);
        BoatSimulatorController controller = new BoatSimulatorControllerImpl(database);
        CommandHandler handler = new CommandHandlerImpl(controller);
        Runnable engine = new Engine(reader, writer, handler);
        engine.run();
    }
}
