package _16_ObjectCommunicationEX._01_EventImplementation;

import _16_ObjectCommunicationEX._01_EventImplementation.factory.NameChangeProducer;
import _16_ObjectCommunicationEX._01_EventImplementation.implementations.Dispatcher;
import _16_ObjectCommunicationEX._01_EventImplementation.implementations.Handler;
import _16_ObjectCommunicationEX._01_EventImplementation.implementations.NameChange;
import _16_ObjectCommunicationEX._01_EventImplementation.interfaces.NameChangeListener;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Dispatcher dispatcher = new Dispatcher();
        NameChangeListener handler = new Handler();
        dispatcher.addNameChangeListener(handler);

        String input = bf.readLine();
        while (!"End".equalsIgnoreCase(input)) {
            NameChange nameChange = NameChangeProducer.createNameChange(input);
            dispatcher.changeName(nameChange);
            input = bf.readLine();
        }
    }
}
