package _16_ObjectCommunicationEX._01_EventImplementation.interfaces;

import _16_ObjectCommunicationEX._01_EventImplementation.implementations.NameChange;

public interface NameChangeListener {
    void handleChangedName(NameChange event);
}
