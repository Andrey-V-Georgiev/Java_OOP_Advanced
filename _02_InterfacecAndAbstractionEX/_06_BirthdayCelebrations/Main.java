package _02_InterfacecAndAbstractionEX._06_BirthdayCelebrations;

import _02_InterfacecAndAbstractionEX._06_BirthdayCelebrations.classes.Citizen;
import _02_InterfacecAndAbstractionEX._06_BirthdayCelebrations.classes.Pet;
import _02_InterfacecAndAbstractionEX._06_BirthdayCelebrations.interfaces.Birthday;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Birthday> creatures = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = bf.readLine().split(" ");
        while (true) {
            String command = tokens[0];
            switch (command) {
                case "Citizen":
                    Birthday citizen = new Citizen(tokens[1], Integer.parseInt(tokens[2]), tokens[3], tokens[4]);
                    creatures.add(citizen);
                    break;

                case "Pet":
                    Birthday pet = new Pet(tokens[1], tokens[2]);
                    creatures.add(pet);
                    break;

                case "End":
                    printBirthdays(bf.readLine());
                    return;
            }
            tokens = bf.readLine().split(" ");
        }
    }

    private static void printBirthdays(String date) {
        StringBuilder sb = new StringBuilder();
        for (Birthday creature : creatures) {
            if (creature.getBirthday().endsWith(date)) {
                sb.append(creature.getBirthday() + "\n");
            }
        }
        String output = sb.toString().equalsIgnoreCase("")? "" : sb.toString();
        System.out.print(output);
    }
}
