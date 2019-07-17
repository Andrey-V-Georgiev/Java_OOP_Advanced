package models.players.impl;

import models.BasePlayer;
import repositories.interfaces.CardRepository;

public class Beginner extends BasePlayer {
    private final int defaultHealthPoints = 50;

    public Beginner(CardRepository cardRepository, String username) {
        super(cardRepository, username);
    }

    public int getDefaultHealthPoints() {
        return this.defaultHealthPoints;
    }
}
