package _14_DependencyInversionEX.src.exeptions;

public class NoSetRaceException extends Exception{
    public NoSetRaceException(String message) {
        super(message);
    }
}