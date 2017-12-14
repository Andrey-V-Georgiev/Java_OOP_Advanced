package _14_DependencyInversionEX.src.models.boats;

import _14_DependencyInversionEX.src.contracts.Modelable;
import _14_DependencyInversionEX.src.contracts.Race;

public interface Boat extends Modelable {
    double calculateRaceSpeed(Race race);
}
