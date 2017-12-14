package _16_ObjectCommunicationEX._01_EventImplementation.factory;

import _16_ObjectCommunicationEX._01_EventImplementation.implementations.NameChange;

public class NameChangeProducer {

    public static NameChange createNameChange(String newName){
        NameChange nameChange = new NameChange(newName);
        return nameChange;
    }
}
