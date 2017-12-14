package _12_LiskovAndOCP_EX._01_Logger.interfaces;


import _12_LiskovAndOCP_EX._01_Logger.implementations.Importance;

public interface Appender {
    void addMessage(String dateTime, Importance importance, String message);
}
