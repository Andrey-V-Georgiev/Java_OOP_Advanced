package _14_DependencyInversionEX.src.exeptions;

public class RaceAlreadyExistsException extends Exception {
    public RaceAlreadyExistsException(String message) {
        super(message);
    }
}
