package models.battleFields;

import models.battleFields.interfaces.Battlefield;
import models.cards.interfaces.Card;
import models.players.interfaces.Player;

import static common.ConstantMessages.*;

public class BattleFieldImpl implements Battlefield {

    @Override
    public void fight(Player attackPlayer, Player enemyPlayer) {
        if (attackPlayer.isDead() || enemyPlayer.isDead()) {
            throw new IllegalArgumentException(PLAYER_IS_DEAD);
        }

        while (!attackPlayer.isDead() || !enemyPlayer.isDead()) {

            Card attackDamageCard = attackPlayer.getCardRepository().getCards().get(0);
            attackPlayer.getCardRepository().remove(attackDamageCard);
            enemyPlayer.takeDamage(attackDamageCard.getDamagePoints());
            if (attackPlayer.isDead()) {
                throw new IllegalArgumentException(PLAYER_IS_DEAD);
            }

            Card enemyPlayerCard = enemyPlayer.getCardRepository().getCards().get(0);
            enemyPlayer.getCardRepository().remove(enemyPlayerCard);
            attackPlayer.takeDamage(enemyPlayerCard.getDamagePoints());
            if (attackPlayer.isDead()) {
                throw new IllegalArgumentException(PLAYER_IS_DEAD);
            }

        }
    }

    private boolean isBeginner(Player player) {
        String playerName = player.getClass().getSimpleName();
        return playerName.equals("Beginner");
    }
}
