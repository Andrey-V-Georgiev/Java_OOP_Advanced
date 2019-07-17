package models;

import models.players.interfaces.Player;
import repositories.interfaces.CardRepository;

import static common.ConstantMessages.*;


public abstract class BasePlayer implements Player {
    private String username;
    private int health;
    private CardRepository cardRepository;
    private boolean isDead;

    public BasePlayer(CardRepository cardRepository, String username, int health) {
        this.cardRepository = cardRepository;
        this.username = username;
        this.health = health;
    }

    public BasePlayer(CardRepository cardRepository, String username) {
        this.cardRepository = cardRepository;
        this.username = username;
    }

    @Override
    public CardRepository getCardRepository() {
        return this.cardRepository;
    }

    @Override
    public String getUsername() {
        if((this.username == null) || this.username.isEmpty()){
            throw new IllegalArgumentException(PLAYER_USERNAME_EXCEPTION);
        }
        return this.username;
    }

    @Override
    public int getHealth() {
        if(this.health < 0){
            throw new IllegalArgumentException(PLAYER_HEALTH_EXCEPTION);
        }
        return this.health;
    }

    @Override
    public void setHealth(int healthPoints) {
        this.health += healthPoints;
    }

    @Override
    public boolean isDead() {
        return this.isDead;
    }

    @Override
    public void takeDamage(int damagePoints) {
        if(damagePoints < 0){
            throw new IllegalArgumentException(PLAYER_DAMAGE_POINTS_EXCEPTION);
        }
        this.health -= damagePoints;
        if(this.health <= 0){
            this.isDead = true;

                throw new IllegalArgumentException(PLAYER_IS_DEAD);

        }
    }
}
