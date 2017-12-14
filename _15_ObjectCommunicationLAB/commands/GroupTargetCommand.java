package _15_ObjectCommunicationLAB.commands;

import _15_ObjectCommunicationLAB.interfaces.AttackGroup;
import _15_ObjectCommunicationLAB.interfaces.Command;
import _15_ObjectCommunicationLAB.interfaces.Target;

public class GroupTargetCommand implements Command {
    private AttackGroup group;
    private Target target;

    public GroupTargetCommand(AttackGroup group, Target target) {
       this.group  = group;
       this.target = target;
    }

    @Override
    public void execute() {
        this.group.groupTarget(this.target);
    }
}
