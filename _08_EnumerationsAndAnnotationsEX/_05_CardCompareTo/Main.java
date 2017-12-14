package _08_EnumerationsAndAnnotationsEX._05_CardCompareTo;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<Card> cards = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            RankPowers rank = RankPowers.valueOf(bf.readLine());
            SuitPowers suit = SuitPowers.valueOf(bf.readLine());
            Card card = new Card(rank, suit);
            cards.add(card);
        }
        System.out.println(cards.get(0).compareTo(cards.get(1)) > 0 ? cards.get(0).toString() : cards.get(1).toString());
    }
}
