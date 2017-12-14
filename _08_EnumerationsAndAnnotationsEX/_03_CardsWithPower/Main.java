package _08_EnumerationsAndAnnotationsEX._03_CardsWithPower;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        RankPowers rank = RankPowers.valueOf(bf.readLine().toUpperCase());
        SuitPowers suit = SuitPowers.valueOf(bf.readLine().toUpperCase());
        int power = rank.getRank() + suit.getSuit();
        System.out.println(String.format("Card name: %s of %s; Card power: %d",
                rank.name(), suit.name(), power));
    }
}
