package _02_InterfacecAndAbstractionEX._07_FoodShortage;

import _02_InterfacecAndAbstractionEX._07_FoodShortage.classes.Citizen;
import _02_InterfacecAndAbstractionEX._07_FoodShortage.classes.Rebel;
import _02_InterfacecAndAbstractionEX._07_FoodShortage.interfaces.Buyer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    static Map<String, Buyer> buyers = new HashMap<>();
    static List<String> inputNames = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = bf.readLine().split(" ");
            switch(tokens.length){
                case 4:
                    String name = tokens[0];
                    Buyer citizen = new Citizen(Integer.parseInt(tokens[1]), tokens[2],tokens[3]);
                    buyers.putIfAbsent(name , citizen);
                    break;
                case 3:
                    name = tokens[0];
                    Buyer rebel = new Rebel(Integer.parseInt(tokens[1]), tokens[2]);
                    buyers.putIfAbsent(name, rebel);
                    break;
                default:
                    break;
            }
        }

        String input = bf.readLine();
        while(!"End".equalsIgnoreCase(input)){
            inputNames.add(input);
            input = bf.readLine();
        }

        for (String name : inputNames) {
            if(buyers.containsKey(name)){
                buyers.get(name).buyFood();
            }
        }

        System.out.println(buyers.values().stream().mapToInt(Buyer::getFood).sum());
    }
}
