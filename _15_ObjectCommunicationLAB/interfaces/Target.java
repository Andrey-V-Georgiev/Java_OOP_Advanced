package _15_ObjectCommunicationLAB.interfaces;


import _15_ObjectCommunicationLAB.abstractClasses.AbstractLogger;
import _15_ObjectCommunicationLAB.enumerations.LogType;
import _15_ObjectCommunicationLAB.loggers.CombatLogger;
import _15_ObjectCommunicationLAB.loggers.ErrorLogger;

public interface Target {
    void receiveDamage(int dmg);
    boolean isDead();

    class Main {
        public static void main(String[] args) {
            AbstractLogger combatLog = new CombatLogger();
            AbstractLogger errorLog = new ErrorLogger();

            combatLog.setSuccessor(errorLog);

            combatLog.handle(LogType.ATTACK, "some attack");
            combatLog.handle(LogType.ERROR, "some error");
            combatLog.handle(LogType.EVENT, "some event");
        }
    }
}