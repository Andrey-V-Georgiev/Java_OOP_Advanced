package _13_DependencyInversionLAB.src.p01_system_resources;

import _13_DependencyInversionLAB.src.p01_system_resources.implementations.ConsoleWriter;
import _13_DependencyInversionLAB.src.p01_system_resources.implementations.GreetingClock;
import _13_DependencyInversionLAB.src.p01_system_resources.implementations.TestTime;
import _13_DependencyInversionLAB.src.p01_system_resources.interfaces.TimeProvider;
import _13_DependencyInversionLAB.src.p01_system_resources.interfaces.Writer;

public class Main {
    public static void main(String[] args) {
        TimeProvider time = new TestTime();
        Writer writer = new ConsoleWriter();
        GreetingClock greetingClock = new GreetingClock(time, writer);
        greetingClock.greeting();
    }
}
