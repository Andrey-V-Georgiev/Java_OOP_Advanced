package _15_ObjectCommunicationLAB.implementations;


import _15_ObjectCommunicationLAB.interfaces.Command;
import _15_ObjectCommunicationLAB.interfaces.Executor;

public class CommandExecutor implements Executor {
    @Override
    public void executeCommand(Command command) {
        command.execute();
    }
}
