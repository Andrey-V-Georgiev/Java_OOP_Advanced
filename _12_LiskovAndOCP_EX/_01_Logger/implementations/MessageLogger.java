package _12_LiskovAndOCP_EX._01_Logger.implementations;

import _12_LiskovAndOCP_EX._01_Logger.interfaces.Appender;
import _12_LiskovAndOCP_EX._01_Logger.interfaces.Logger;

import java.util.ArrayList;
import java.util.List;

public class MessageLogger implements Logger{
    private List<Appender> appenders = new ArrayList<>();

    public MessageLogger(List<Appender> appenders){
        this.appenders.addAll(appenders);
    }

    public void printResults(){
        System.out.println("Logger info");
        for (Appender appender : appenders) {
            System.out.println(appender.toString());
        }
    }

    @Override
    public void logInfo(String dateTime, String message) {
        for (Appender appender : appenders) {
                appender.addMessage(dateTime, Importance.INFO, message);
        }
    }

    @Override
    public void logWarning(String dateTime, String message) {
        for (Appender appender : appenders) {
                appender.addMessage(dateTime, Importance.WARNING, message);
        }
    }

    @Override
    public void logError(String dateTime, String message) {
        for (Appender appender : appenders) {
                appender.addMessage(dateTime, Importance.ERROR, message);
        }
    }

    @Override
    public void logCritical(String dateTime, String message) {
        for (Appender appender : appenders) {
                appender.addMessage(dateTime, Importance.CRITICAL, message);
        }
    }

    @Override
    public void logFatal(String dateTime, String message) {
        for (Appender appender : appenders) {
                appender.addMessage(dateTime, Importance.FATAL, message);
        }
    }
}
