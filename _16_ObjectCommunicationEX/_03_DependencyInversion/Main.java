package _16_ObjectCommunicationEX._03_DependencyInversion;

import _16_ObjectCommunicationEX._03_DependencyInversion.interfaces.Strategy;
import _16_ObjectCommunicationEX._03_DependencyInversion.strategies.AdditionStrategy;
import _16_ObjectCommunicationEX._03_DependencyInversion.strategies.DividingStrategy;
import _16_ObjectCommunicationEX._03_DependencyInversion.strategies.MultiplyingStrategy;
import _16_ObjectCommunicationEX._03_DependencyInversion.strategies.SubtractionStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Strategy strategy = new AdditionStrategy();
        PrimitiveCalculator calculator = new PrimitiveCalculator(strategy);

        while(true){
            String[] tokens = bf.readLine().split(" ");
            if("End".equalsIgnoreCase(tokens[0])){
                return;
            }
            if("mode".equalsIgnoreCase(tokens[0])){
                calculator.changeStrategy(supplyStrategy(tokens[1]));
            } else {
                System.out.println(calculator.performCalculation(
                        Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1])));
            }
        }
    }

    private static Strategy supplyStrategy(String token) {
        Strategy strategy = null;
        switch (token){
            case "+":
                strategy = new AdditionStrategy();
                break;
            case "-":
                strategy = new SubtractionStrategy();
                break;
            case "*":
                strategy = new MultiplyingStrategy();
                break;
            case "/":
                strategy = new DividingStrategy();
                break;
        }
        return strategy;
    }
}
