package _13_DependencyInversionLAB.src.p01_system_resources.implementations;

import _13_DependencyInversionLAB.src.p01_system_resources.interfaces.TimeProvider;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class AnotherTime implements TimeProvider {
    @Override
    public int getHour() {
        Date date = new Date();
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.HOUR_OF_DAY);
    }
}
