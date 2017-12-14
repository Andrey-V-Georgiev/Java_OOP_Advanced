package _15_ObjectCommunicationLAB.commands;


import _15_ObjectCommunicationLAB.interfaces.Attacker;
import _15_ObjectCommunicationLAB.interfaces.Command;
import _15_ObjectCommunicationLAB.interfaces.Target;

public class TargetCommand implements Command {
    private Attacker attacker;
    private Target target;

    public TargetCommand(Attacker attacker, Target target) {
        this.attacker = attacker;
        this.target = target;
    }

    @Override
    public void execute() {
        this.attacker.setTarget(this.target);
    }
}
