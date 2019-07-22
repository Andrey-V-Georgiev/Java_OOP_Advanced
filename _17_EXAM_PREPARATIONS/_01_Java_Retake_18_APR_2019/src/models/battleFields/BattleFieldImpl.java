package models.battleFields;

import models.battleFields.interfaces.Battlefield;
import models.cards.interfaces.Card;
import models.players.interfaces.Player;

import static common.ConstantMessages.*;

public class BattleFieldImpl implements Battlefield {

    @Override
    public void fight(Player attackPlayer, Player enemyPlayer) {

        while (!attackPlayer.isDead() || !enemyPlayer.isDead()) {
            int attackDamage = sumDamagePoints(attackPlayer);
            int enemyDamage = sumDamagePoints(enemyPlayer);

            enemyPlayer.takeDamage(attackDamage);
            if(enemyPlayer.isDead()){
                return;
            }
            attackPlayer.takeDamage(enemyDamage);
            if(attackPlayer.isDead()){
                return;
            }
        }
    }

    private int sumDamagePoints(Player player){
       return player
                .getCardRepository()
                .getCards()
                .stream()
                .mapToInt(Card::getDamagePoints)
                .sum();
    }
}
