package _15_ObjectCommunicationLAB.abstractClasses;

import _15_ObjectCommunicationLAB.enumerations.LogType;
import _15_ObjectCommunicationLAB.interfaces.Handler;


public abstract class AbstractLogger implements Handler {
    private Handler successor;

    protected Handler getSuccessor() {
        return this.successor;
    }

    public void setSuccessor(Handler handler){
        this.successor = handler;
    }

    protected void passToSuccessor(LogType type, String message){
        if(this.successor != null){
            this.successor.handle(type, message);
        }
    }

    public abstract void handle(LogType type, String message);

}
