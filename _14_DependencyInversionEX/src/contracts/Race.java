package _14_DependencyInversionEX.src.contracts;

import _14_DependencyInversionEX.src.exeptions.DuplicateModelException;
import _14_DependencyInversionEX.src.models.boats.Boat;

import java.util.List;

public interface Race
{
    int getDistance();

    int getWindSpeed ();

    int getOceanCurrentSpeed();

    boolean getAllowsMotorboats ();

    void addParticipant(Boat boat) throws DuplicateModelException;

    List<Boat> getParticipants();
}
