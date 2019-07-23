package models.battleFields;

import models.battleFields.interfaces.Battlefield;
import models.cards.interfaces.Card;
import models.players.interfaces.Player;

import java.util.List;

import static common.ConstantMessages.*;

public class BattleFieldImpl implements Battlefield {

    @Override
    public void fight(Player attackPlayer, Player enemyPlayer) {

        if (attackPlayer.isDead() || enemyPlayer.isDead()) {
            throw new IllegalArgumentException(PLAYER_IS_DEAD);
        }

        while (!attackPlayer.isDead() || !enemyPlayer.isDead()) {
            int attackDamage = sumDamagePoints(attackPlayer);
            int enemyDamage = sumDamagePoints(enemyPlayer);

            enemyPlayer.takeDamage(attackDamage);
            if (enemyPlayer.isDead()) {
                return;
            }
            attackPlayer.takeDamage(enemyDamage);
        }
    }

    private int sumDamagePoints(Player player) {
        int damagePoints = 0;
        List<Card> playerCards = player.getCardRepository().getCards();
        for (Card card : playerCards) {
            int cardDamagePoints = card.getDamagePoints();
            damagePoints += cardDamagePoints;
        }

        return damagePoints;
    }
}
