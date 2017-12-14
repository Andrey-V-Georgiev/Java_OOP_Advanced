package _08_EnumerationsAndAnnotationsEX._07_DeckOfCards;

public enum SuitPowers {
    CLUBS(0), DIAMONDS(13), HEARTS(26), SPADES(39);

    private int suit;

    SuitPowers(int suit) {
        this.suit = suit;
    }

    public int getSuit() {
        return this.suit;
    }
}
