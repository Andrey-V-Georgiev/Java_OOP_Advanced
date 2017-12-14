package _15_ObjectCommunicationLAB.commands;


import _15_ObjectCommunicationLAB.interfaces.Attacker;
import _15_ObjectCommunicationLAB.interfaces.Command;

public class AttackCommand implements Command {
    private Attacker attacker;

    public AttackCommand(Attacker attacker) {
        this.attacker = attacker;
    }

    @Override
    public void execute() {
        this.attacker.attack();
    }
}
