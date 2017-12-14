package _15_ObjectCommunicationLAB.commands;


import _15_ObjectCommunicationLAB.interfaces.AttackGroup;
import _15_ObjectCommunicationLAB.interfaces.Command;

public class GroupAttackCommand implements Command {
    private AttackGroup group;

    public GroupAttackCommand(AttackGroup group) {
        this.group = group;
    }

    @Override
    public void execute() {
        this.group.groupAttack();
    }
}
