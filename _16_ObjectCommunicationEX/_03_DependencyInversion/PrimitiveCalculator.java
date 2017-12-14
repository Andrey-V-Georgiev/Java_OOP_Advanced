package _16_ObjectCommunicationEX._03_DependencyInversion;


import _16_ObjectCommunicationEX._03_DependencyInversion.interfaces.Strategy;

public class PrimitiveCalculator {

    private boolean isAddition;
    private Strategy strategy;


    public PrimitiveCalculator(Strategy strategy) {
        this.strategy = strategy;
    }

    public void changeStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int performCalculation(int firstOperand, int secondOperand) {
        return this.strategy.calculate(firstOperand, secondOperand);
    }
}
