package _07_EnumerationsAndAnnotationsLAB._03_CoffeeMachine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        while(true) {
            String[] line = bf.readLine().split(" ");
            if("end".equalsIgnoreCase(line[0])){
                break;
            } else if(line.length == 1){
                coffeeMachine.insertCoin(line[0]);
            } else {
                coffeeMachine.buyCoffee(line[0], line[1]);
            }
        }

        for (Coffee coffee : coffeeMachine.coffeesSold()) {
            System.out.println(coffee);
        }
    }
}
