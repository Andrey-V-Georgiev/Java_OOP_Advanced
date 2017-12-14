package _16_ObjectCommunicationEX._02_KingsGambit_05_Extended;

import _16_ObjectCommunicationEX._02_KingsGambit_05_Extended.classes.CustomArrayList;
import _16_ObjectCommunicationEX._02_KingsGambit_05_Extended.classes.FootmanImpl;
import _16_ObjectCommunicationEX._02_KingsGambit_05_Extended.classes.King;
import _16_ObjectCommunicationEX._02_KingsGambit_05_Extended.classes.RoyalGuardImpl;
import _16_ObjectCommunicationEX._02_KingsGambit_05_Extended.intefaces.Unit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String kingName = bf.readLine();

        String[] guardsNames = bf.readLine().split(" ");
        CustomArrayList units = new CustomArrayList();

        for (String guardName : guardsNames) {
            Unit newGuard = new RoyalGuardImpl(guardName);
            units.add(newGuard);
        }
        String[] footmanNames = bf.readLine().split(" ");
        for (String footmanName : footmanNames) {
            Unit newFootman = new FootmanImpl(footmanName);
            units.add(newFootman);
        }
        King king = new King(kingName, units);

        while(true){
            String input = bf.readLine();
            if("End".equalsIgnoreCase(input)){
                return;
            } else if("Attack King".equalsIgnoreCase(input)){
                king.attacked();
            } else {
                king.killUnit(input.split(" ")[1]);
            }
        }
    }
}
