package _13_DependencyInversionLAB.src.p01_system_resources.implementations;

import _13_DependencyInversionLAB.src.p01_system_resources.interfaces.TimeProvider;

import java.time.LocalTime;

public class TestTime implements TimeProvider {

    @Override
    public int getHour() {
        return LocalTime.now().getHour();
    }
}
