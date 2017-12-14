package _14_DependencyInversionEX.src.controllers;

import _14_DependencyInversionEX.src.contracts.BoatSimulatorController;
import _14_DependencyInversionEX.src.contracts.Database;
import _14_DependencyInversionEX.src.exeptions.*;
import _14_DependencyInversionEX.src.models.boats.Boat;
import _14_DependencyInversionEX.src.contracts.Race;
import _14_DependencyInversionEX.src.database.BoatSimulatorDatabase;
import jdk.jshell.spi.ExecutionControl;


import java.util.*;

public class BoatSimulatorControllerImpl implements BoatSimulatorController {
    private LinkedHashMap<Double, Boat> map;
    private Database database;
    private Race currentRace;

    public BoatSimulatorControllerImpl(Database database) {
        this.database = database;
        this.currentRace = currentRace;
    }

    @Override
    public String createBoatEngine(String model, int horsepower, int displacement, String engineType) {
        return null;
    }

    @Override
    public String createRowBoat(String model, int weight, int oars) throws DuplicateModelException {
        return null;
    }

    @Override
    public String createSailBoat(String model, int weight, int sailEfficiency) throws DuplicateModelException {
        return null;
    }

    @Override
    public String createPowerBoat(String model, int weight, String firstEngineModel, String secondEngineModel) throws NonExistantModelException, DuplicateModelException {
        return null;
    }

    @Override
    public String createYacht(String model, int weight, String engineModel, int cargoWeight) throws NonExistantModelException, DuplicateModelException {
        return null;
    }

    @Override
    public String openRace(int distance, int windSpeed, int oceanCurrentSpeed, Boolean allowsMotorboats) throws RaceAlreadyExistsException {
        return null;
    }

    @Override
    public String signUpBoat(String model) throws NonExistantModelException, DuplicateModelException, NoSetRaceException {
        return null;
    }

    @Override
    public String startRace() throws InsufficientContestantsException, NoSetRaceException {
        return null;
    }

    @Override
    public String getStatistic() throws ExecutionControl.NotImplementedException, ExecutionControl.NotImplementedException {
        return null;
    }

//    @Override
//    public String createBoatEngine(String model, int horsepower, int displacement, String engineType) {
//        return null;
//    }
//
//    @Override
//    public String createBoatEngine(String model, int horsepower, int displacement, EngineType engineType) throws DuplicateModelException {
//        Modelable engine;
//        switch (engineType) {
//            case Jet:
//                engine = new JetEngine(model, horsepower, displacement);
//                break;
//            case Sterndrive:
//                engine = new SterndriveEngine(model, horsepower, displacement);
//                break;
//            default:
//                throw new NotImplementedException();
//        }
//
//        this.database.getEngines().add(engine);
//        return String.format(
//                "Engine model %s with %s HP and displacement %s cm3 created successfully.",
//                model,
//                horsepower,
//                displacement);
//    }
//
//    @Override
//    public String createRowBoat(String model, int weight, int oars) throws DuplicateModelException {
//        Boat boat = new Boat(model, weight, 1, oars, 1, new ArrayList<JetEngine>(), new ArrayList<SterndriveEngine>(), false);
//        this.database.getBoats().add(boat);
//        return String.format("Row boat with model %s registered successfully.", model);
//    }
//
//    @Override
//    public String createSailBoat(String model, int weight, int sailEfficiency) throws DuplicateModelException {
//        Boat boat = new Boat(model, weight, sailEfficiency, 1, 1, new ArrayList<JetEngine>(), new ArrayList<SterndriveEngine>(), true);
//        this.database.getBoats().add(boat);
//        return String.format("Sail boat with model %s registered successfully.", model);
//    }
//
//    @Override
//    public String createPowerBoat(String model, int weight, String firstEngineModel, String secondEngineModel) throws NonExistantModelException, DuplicateModelException {
//        JetEngine firstEngine = (JetEngine) this.database.getEngines().getItem(firstEngineModel);
//        SterndriveEngine secondEngine = (SterndriveEngine) this.database.getEngines().getItem(secondEngineModel);
//        Boat boat = new Boat(model, weight, 1, 1, 1, Arrays.asList(firstEngine), Arrays.asList(secondEngine), false);
//        this.database.getBoats().add(boat);
//        return String.format("Power boat with model %s registered successfully.", model);
//    }
//
//    public String createYacht(String model, int weight, String engineModel, int cargoWeight) throws NonExistantModelException, DuplicateModelException {
//        JetEngine engine = (JetEngine) this.database.getEngines().getItem(engineModel);
//        Boat boat = new Boat(model, weight, 1, 1, cargoWeight, Arrays.asList(engine), new ArrayList<SterndriveEngine>(), false);
//        this.database.getBoats().add(boat);
//        return String.format("Yacht with model %s registered successfully.", model);
//    }
//
//    @Override
//    public String openRace(int distance, int windSpeed, int oceanCurrentSpeed, Boolean allowsMotorboats) throws RaceAlreadyExistsException {
//        Race race = new RaceImpl(distance, windSpeed, oceanCurrentSpeed, allowsMotorboats);
//        this.validateRaceIsEmpty();
//        this.currentRace = race;
//        return
//                String.format(
//                        "A new race with distance %s meters, wind speed %sm/s and ocean current speed %s m/s has been set.",
//                        distance, windSpeed, oceanCurrentSpeed);
//    }
//
//    @Override
//    public String signUpBoat(String model) throws NonExistantModelException, DuplicateModelException, NoSetRaceException {
//        Boat boat = this.database.getBoats().getItem(model);
//        this.validateRaceIsSet();
//        if (!this.currentRace.getAllowsMotorboats() && boat instanceof Boat) {
//            throw new IllegalArgumentException(Constants.INCORRECT_BOAT_TYPE_MESSAGE);
//        }
//        this.currentRace.addParticipant(boat);
//        return String.format("Boat with model %s has signed up for the current Race.", model);
//    }
//
//    @Override
//    public String startRace() throws InsufficientContestantsException, NoSetRaceException {
//        this.validateRaceIsSet();
//        List<Boat> participants = this.currentRace.getParticipants();
//        if (participants.size() < 3) {
//            throw new InsufficientContestantsException(Constants.INSUFFICIENT_CONTESTANTS_MESSAGE);
//        }
//
//
//        for (int i = 0; i < 3; i++) {
//            this.findFastest(participants);
//        }
//
//        StringBuilder result = new StringBuilder();
//        for (Map.Entry<Double, Boat> doubleMotorBoatEntry : map.entrySet()) {
//            result.append(String.format("First place: %s Model: %s Time: %s",
//                    doubleMotorBoatEntry.getValue().getClass().getSimpleName().toString(),
//                    doubleMotorBoatEntry.getValue().getModel(),
//                    isFinished(doubleMotorBoatEntry.getKey())));
//        }
//
//        this.currentRace = null;
//
//        return result.toString();
//    }
//
//    private String isFinished(Double key) {
//        if (key == Double.NEGATIVE_INFINITY) {
//            return "Did not finish!";
//        }
//        return String.format("%f.2 sec", key);
//    }
//
//    @Override
//    public String getStatistic() throws ExecutionControl.NotImplementedException {
//        //TODO Bonus task
//        throw new ExecutionControl.NotImplementedException("Not implement");
//
//    }
//
//    private void findFastest(List<Boat> participants) {
//        Double bestTime = 0.0;
//        Boat winner = null;
//        for (Boat participant : participants) {
//            Double speed = participant.calculateRaceSpeed(this.currentRace);
//            Double time = this.currentRace.getDistance() / speed;
//            if (time < bestTime) {
//                bestTime = time;
//                winner = participant;
//            }
//        }
//
//        map.put(bestTime, winner);
//        participants.remove(winner);
//    }
//
//    private void validateRaceIsSet() throws NoSetRaceException {
//        if (this.currentRace == null) {
//            throw new NoSetRaceException(Constants.NO_SET_RACE_MESSAGE);
//        }
//    }
//
//    private void validateRaceIsEmpty() throws RaceAlreadyExistsException {
//        if (this.currentRace != null) {
//            throw new RaceAlreadyExistsException(Constants.RACE_ALREADY_EXISTS_MESSAGE);
//        }
//    }
}
