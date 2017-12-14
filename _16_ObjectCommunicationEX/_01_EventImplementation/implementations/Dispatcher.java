package _16_ObjectCommunicationEX._01_EventImplementation.implementations;

import _16_ObjectCommunicationEX._01_EventImplementation.interfaces.NameChangeListener;

import java.util.ArrayList;
import java.util.List;

public class Dispatcher {
    private String name;
    private List<NameChangeListener> listeners;

    public Dispatcher() {
        this.listeners = new ArrayList<>();
    }

    public void changeName(NameChange nameChange){
        this.name = nameChange.getChangedName();
        this.fireNameChangeEvent(nameChange);
    }


    public void addNameChangeListener(NameChangeListener newListener) {
        this.listeners.add(newListener);
    }

    public void removeNameChangeListener(NameChangeListener removeListener) {
        this.listeners.remove(removeListener);
    }

    public void fireNameChangeEvent(NameChange nameChange) {
        for (NameChangeListener listener : this.listeners) {
            listener.handleChangedName(nameChange);
        }
    }
}
