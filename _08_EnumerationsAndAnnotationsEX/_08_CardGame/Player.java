package _08_EnumerationsAndAnnotationsEX._08_CardGame;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Player {
    private String name;
    private List<Card> cards;

    public Player(String name) {
        this.name = name;
        this.cards = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public boolean stop(){
        return this.cards.size() == 5;
    }

    public void addCard(Card card){
       if(this.cards.contains(card)){
           throw new IllegalArgumentException("Card is not in the deck.");
       }
       this.cards.add(card);
    }

    public boolean containsCard(Card card){
        return this.cards.contains(card);
    }

    public Card getBiggest(){
        return this.cards.stream().sorted(Card::compareTo).collect(Collectors.toList()).get(0);
    }
}
