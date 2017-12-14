package _00_DESIGN_PATTERNS._02_STRATEGY_PATTERN;

public class OperationMultyplay implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
