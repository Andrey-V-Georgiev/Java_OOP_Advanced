package _15_ObjectCommunicationLAB.interfaces;


import _15_ObjectCommunicationLAB.enumerations.LogType;

public interface Handler {
    void handle(LogType type, String message);

    void setSuccessor(Handler handler);
}
