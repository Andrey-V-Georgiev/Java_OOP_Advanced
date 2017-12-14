package _02_InterfacecAndAbstractionEX._10_MooD3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = bf.readLine().split("\\s\\|\\s");
        String userName = tokens[0];
        String characterType = tokens[1];
        double specialPoints = Double.parseDouble(tokens[2]);
        int level = Integer.parseInt(tokens[3]);

        GameObjectsInterface newObject = null;
        switch(characterType){
            case "Demon":
                newObject = new Demon( userName, characterType, specialPoints, level);
                break;
            case "Archangel":
                newObject = new Archangel(userName, characterType, specialPoints, level);
                break;
        }
        System.out.println(newObject.toString());
    }
}
