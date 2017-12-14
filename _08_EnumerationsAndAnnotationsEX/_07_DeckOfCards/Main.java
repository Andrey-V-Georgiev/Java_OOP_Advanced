package _08_EnumerationsAndAnnotationsEX._07_DeckOfCards;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        RankPowers[] rankPowers = RankPowers.values();
        SuitPowers[] suitPowers = SuitPowers.values();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        if(bf.readLine().equals("Card Deck")){
            for (int i = 0; i < suitPowers.length; i++) {
                for (int j = 0; j < rankPowers.length; j++) {
                    System.out.println(String.format("%s of %s", rankPowers[j], suitPowers[i]));
                }
            }
        }
    }
}
