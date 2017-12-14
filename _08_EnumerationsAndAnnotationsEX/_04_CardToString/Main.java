package _08_EnumerationsAndAnnotationsEX._04_CardToString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        RankPowers rank = RankPowers.valueOf(bf.readLine().toUpperCase());
        SuitPowers suit = SuitPowers.valueOf(bf.readLine().toUpperCase());
        Card card = new Card(rank, suit);
        System.out.println(card.toString());
    }
}
