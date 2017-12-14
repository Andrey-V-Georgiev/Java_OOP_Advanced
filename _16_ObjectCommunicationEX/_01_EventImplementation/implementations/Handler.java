package _16_ObjectCommunicationEX._01_EventImplementation.implementations;

import _16_ObjectCommunicationEX._01_EventImplementation.interfaces.NameChangeListener;

public class Handler implements NameChangeListener{
    public Handler() {
    }

    @Override
    public void handleChangedName(NameChange event) {
        System.out.println(String.format("Dispatcher's name changed to %s.", event.getChangedName()));
    }
}
