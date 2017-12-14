package _15_ObjectCommunicationLAB;

import _15_ObjectCommunicationLAB.abstractClasses.AbstractHero;
import _15_ObjectCommunicationLAB.commands.GroupAttackCommand;
import _15_ObjectCommunicationLAB.commands.GroupTargetCommand;
import _15_ObjectCommunicationLAB.heroes.Dragon;
import _15_ObjectCommunicationLAB.heroes.Warrior;
import _15_ObjectCommunicationLAB.implementations.CommandExecutor;
import _15_ObjectCommunicationLAB.implementations.Group;
import _15_ObjectCommunicationLAB.interfaces.AttackGroup;
import _15_ObjectCommunicationLAB.interfaces.Command;
import _15_ObjectCommunicationLAB.interfaces.Executor;
import _15_ObjectCommunicationLAB.interfaces.Handler;
import _15_ObjectCommunicationLAB.loggers.CombatLogger;
import _15_ObjectCommunicationLAB.loggers.EventLogger;

public class Main {
    public static void main(String[] args) {

        Handler combatLog = new CombatLogger();
        Handler eventLog = new EventLogger();

        combatLog.setSuccessor(eventLog);

        Executor commandExecutor = new CommandExecutor();
        AbstractHero attacker1 = new Warrior("Pesho", 10, combatLog);
        AbstractHero attacker2 = new Warrior("Gosho", 12, combatLog);
        AbstractHero attacker3 = new Warrior("Stamat", 5, combatLog);
        AbstractHero attacker4 = new Warrior("Jivko", 9, combatLog);
        AbstractHero attacker5 = new Warrior("Ivan", 10, combatLog);
        Dragon target = new Dragon("Dragon", 44, 5, combatLog);

        AttackGroup group = new Group();

        group.addMember(attacker1);
        group.addMember(attacker2);
        group.addMember(attacker3);
        group.addMember(attacker4);
        group.addMember(attacker5);

        target.register(attacker1);
        target.register(attacker2);
        target.register(attacker3);
        target.register(attacker4);
        target.register(attacker5);

        Command setTarget = new GroupTargetCommand(group, target);
        Command attackCommand = new GroupAttackCommand(group);
        commandExecutor.executeCommand(setTarget);
        commandExecutor.executeCommand(attackCommand);

    }
}
