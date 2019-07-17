import models.cards.interfaces.Card;
import repositories.interfaces.CardRepository;

import java.util.List;

import static common.ConstantMessages.CARD_ALREADY_EXISTS;
import static common.ConstantMessages.CARD_NULL_EXCEPTION;

public class CardRepositoryImpl implements CardRepository {
    private List<Card> cards;


    @Override
    public int getCount() {
        return cards.size();
    }

    @Override
    public List<Card> getCards() {
        return this.cards;
    }

    @Override
    public void add(Card card) {
        if(card == null){
            throw new IllegalArgumentException(CARD_NULL_EXCEPTION);
        }
        if(cardAlreadyExists(card)){
            throw new IllegalArgumentException(String.format(CARD_ALREADY_EXISTS, card.getName()));
        }
        this.cards.add(card);
    }

    private boolean cardAlreadyExists(Card card) {
        for (Card c : cards) {
           if(c.getName().equals(card.getName())){
               return true;
           }
        }
       return false;
    }

    @Override
    public boolean remove(Card card) {
       if(find(card.getName()) == null) {
           throw new IllegalArgumentException(CARD_NULL_EXCEPTION);
       }
       this.cards.remove(card);
       return true;
    }

    @Override
    public Card find(String name) {
        for (Card c : cards) {
            if(c.getName().equals(name)){
                return c;
            }
        }
        return null;
    }
}
