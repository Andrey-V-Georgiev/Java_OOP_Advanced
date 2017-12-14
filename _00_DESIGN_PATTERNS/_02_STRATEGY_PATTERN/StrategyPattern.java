package _00_DESIGN_PATTERNS._02_STRATEGY_PATTERN;

public class StrategyPattern {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultyplay());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
