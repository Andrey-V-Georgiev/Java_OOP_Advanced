package _15_ObjectCommunicationLAB.interfaces;

public interface Subject {
     void register(Observer observer);

    void unregister(Observer observer);

    void notifyObservers();
}
