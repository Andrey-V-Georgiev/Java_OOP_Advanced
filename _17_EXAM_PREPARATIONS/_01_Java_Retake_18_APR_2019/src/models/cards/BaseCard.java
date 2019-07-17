package models.cards;

import models.cards.interfaces.Card;

public abstract class BaseCard implements Card {
    private String name;
    private int damagePoints;
    private int healthPoints;

    public BaseCard(String name, int damagePoints, int healthPoints) {
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
        return 0;
    }

    @Override
    public void setDamagePoints(int damagePoints) {

    }

    @Override
    public int getHealthPoints() {
        return 0;
    }
}
