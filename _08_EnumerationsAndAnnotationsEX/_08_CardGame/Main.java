package _08_EnumerationsAndAnnotationsEX._08_CardGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Player player1 = new Player(bf.readLine());
        Player player2 = new Player(bf.readLine());
        List<String> ranks = Arrays.stream(RankPowers.values()).map(Enum::name).collect(Collectors.toList());
        List<String> suits = Arrays.stream(SuitPowers.values()).map(Enum::name).collect(Collectors.toList());

        while (!player1.stop()) {
            String[] line = bf.readLine().split(" of ");
            String rank = line[0];
            String suit = line[1];
            if (ranks.contains(rank) && suits.contains(suit)) {
                RankPowers rankPower = RankPowers.valueOf(rank);
                SuitPowers suitPower = SuitPowers.valueOf(suit);
                Card card = new Card(rankPower, suitPower);
                try {
                    player1.addCard(card);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                System.out.println("No such card exists.");
            }
        }

        while (!player2.stop()) {
            String[] line = bf.readLine().split(" of ");
            String rank = line[0];
            String suit = line[1];
            if (ranks.contains(rank) && suits.contains(suit)) {
                RankPowers rankPower = RankPowers.valueOf(rank);
                SuitPowers suitPower = SuitPowers.valueOf(suit);
                Card card = new Card(rankPower, suitPower);
                try {
                    player2.addCard(card);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        System.out.println(player1.getBiggest().compareTo(player2.getBiggest()) < 0 ?
                String.format("%S wins with %s of %s.",
                        player1.getName(),
                        player1.getBiggest().getRankPower().name(),
                        player1.getBiggest().getSuitPower().name())
                :
                String.format("%S wins with %s of %s.",
                        player2.getName(),
                        player2.getBiggest().getRankPower().name(),
                        player2.getBiggest().getSuitPower().name()));

    }
}
