package models.cards;

import models.cards.interfaces.Card;

import static common.ConstantMessages.*;

public abstract class BaseCard implements Card {
    private String name;
    private int damagePoints;
    private int healthPoints;

    public BaseCard(String name, int damagePoints, int healthPoints) {
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException(CARD_CANNOT_BE_NULL);
        }
        if(damagePoints < 0){
           throw new IllegalArgumentException(CARD_DAMAGE_POINTS_EXCEPTION);
        }
        if(healthPoints < 0){
            throw new IllegalArgumentException(CARD_HEALTH_POINTS_EXCEPTION);
        }
        this.name = name;
        this.damagePoints = damagePoints;
        this.healthPoints = healthPoints;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getDamagePoints() {
        return this.damagePoints;
    }

    @Override
    public void setDamagePoints(int damagePoints) {
        this.damagePoints += damagePoints;
    }

    @Override
    public int getHealthPoints() {
        return this.healthPoints;
    }
}
