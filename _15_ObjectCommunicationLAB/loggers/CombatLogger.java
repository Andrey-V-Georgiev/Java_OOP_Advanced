package _15_ObjectCommunicationLAB.loggers;


import _15_ObjectCommunicationLAB.abstractClasses.AbstractLogger;
import _15_ObjectCommunicationLAB.enumerations.LogType;

public class CombatLogger extends AbstractLogger {

    @Override
    public void handle(LogType type, String message) {
        if (type == LogType.ATTACK || type == LogType.MAGIC) {
            System.out.println(type.name() + ":" + message);
        }else{
            if(super.getSuccessor() != null){
                super.getSuccessor().handle(type, message);
            }
        }
    }
}
