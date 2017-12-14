package _16_ObjectCommunicationEX._03_DependencyInversion.strategies;

import _16_ObjectCommunicationEX._03_DependencyInversion.interfaces.Strategy;

public class SubtractionStrategy implements Strategy {
    @Override
    public int calculate(int firstOperand, int secondOperand){
        return firstOperand - secondOperand;
    }
}
