package _02_InterfacecAndAbstractionEX._05_BorderControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<ID> listID = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = bf.readLine().split(" ");
        while(!"End".equalsIgnoreCase(tokens[0])){
            int tokensLength = tokens.length;
            switch (tokensLength){
                case 2:
                    ID robot =  new Robot(tokens[0], tokens[1]);
                    listID.add(robot);
                    break;
                case 3:
                    ID citizen = new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                    listID.add(citizen);
                    break;
            }
            tokens = bf.readLine().split(" ");
        }
        filterIDs(bf.readLine());
    }

    private static void filterIDs(String digit) {
        List<String> bannedIDs = new ArrayList<>();
        for (ID id : listID) {
            if(id.getId().endsWith(digit)){
                bannedIDs.add(id.getId());
            }
        }
        printBannedIDs(bannedIDs);
    }

    private static void printBannedIDs(List<String> bannedIDs) {
        for (String id : bannedIDs) {
            System.out.println(id);
        }
    }
}
