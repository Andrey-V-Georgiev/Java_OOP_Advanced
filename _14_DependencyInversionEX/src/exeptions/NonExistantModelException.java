package _14_DependencyInversionEX.src.exeptions;

public class NonExistantModelException extends Exception {
    public NonExistantModelException(String message) {
        super(message);
    }
}
