package _13_DependencyInversionLAB.src.p01_system_resources.implementations;

import _13_DependencyInversionLAB.src.p01_system_resources.interfaces.Writer;

public class ConsoleWriter implements Writer {
    @Override
    public void write(String string) {
        System.out.println(string);
    }
}
