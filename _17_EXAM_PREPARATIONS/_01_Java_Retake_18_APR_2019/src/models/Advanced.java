package models;

import repositories.interfaces.CardRepository;

public class Advanced extends BasePlayer {
    private final int defaultHealthPoints = 250;

    public Advanced(CardRepository cardRepository, String username) {
        super(cardRepository, username);
    }

    public int getDefaultHealthPoints() {
        return this.defaultHealthPoints;
    }
}
