package models.players;

import models.players.interfaces.Player;
import repositories.interfaces.CardRepository;

import static common.ConstantMessages.*;


public abstract class BasePlayer implements Player {
    private String username;
    private int health;
    private CardRepository cardRepository;
    private boolean isDead;

    public BasePlayer(CardRepository cardRepository, String username, int health) {
        if ((username == null) || username.isEmpty()) {
            throw new IllegalArgumentException(PLAYER_USERNAME_EXCEPTION);
        }
        if (health < 0) {
            throw new IllegalArgumentException(PLAYER_HEALTH_EXCEPTION);
        }
        this.cardRepository = cardRepository;
        this.username = username;
        this.health = health;
    }

    @Override
    public CardRepository getCardRepository() {
        return this.cardRepository;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public int getHealth() {
        return this.health;
    }

    @Override
    public void setHealth(int healthPoints) {

        this.health = healthPoints;
    }

    @Override
    public boolean isDead() {
        return this.isDead;
    }

    @Override
    public void takeDamage(int damagePoints) {
        if (damagePoints < 0) {
            throw new IllegalArgumentException(PLAYER_DAMAGE_POINTS_EXCEPTION);
        }
        this.health = Math.max(this.health - damagePoints, 0);
        if (this.health <= 0) {
            this.isDead = true;
            //throw new IllegalArgumentException(PLAYER_IS_DEAD);
        }
    }
}
