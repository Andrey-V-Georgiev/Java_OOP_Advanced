package _13_DependencyInversionLAB.src.p01_system_resources.implementations;


import _13_DependencyInversionLAB.src.p01_system_resources.interfaces.TimeProvider;
import _13_DependencyInversionLAB.src.p01_system_resources.interfaces.Writer;

public class GreetingClock {

    private TimeProvider time;
    private Writer writer;

    public GreetingClock(TimeProvider time, Writer writer) {
        this.time = time;
        this.writer = writer;
    }

    public void greeting() {
        if (time.getHour() < 12) {
            this.writer.write("Good morning...");
        } else if (time.getHour() < 18) {
            this.writer.write("Good afternoon...");
        } else {
            this.writer.write("Good evening...");
        }
    }
}
