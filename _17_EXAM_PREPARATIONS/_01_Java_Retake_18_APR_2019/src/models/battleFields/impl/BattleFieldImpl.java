package models.battleFields.impl;

import models.battleFields.interfaces.Battlefield;
import models.cards.interfaces.Card;
import models.players.interfaces.Player;

import java.util.List;

import static common.ConstantMessages.*;

public class BattleFieldImpl implements Battlefield {

    @Override
    public void fight(Player attackPlayer, Player enemyPlayer) {
        if(attackPlayer.isDead() || enemyPlayer.isDead()){
            throw new IllegalArgumentException(PLAYER_IS_DEAD);
        }
        isBeginner(attackPlayer);
        isBeginner(enemyPlayer);

        while(!attackPlayer.isDead() || !enemyPlayer.isDead()){
            //TODO fight logic
        }
    }


    private void isBeginner(Player player) {

        String playerName = player.getClass().getSimpleName();
        if(playerName.equals("Beginner")){
            player.setHealth(40);
            List<Card> playerCards =  player.getCardRepository().getCards();
            for (Card playerCard : playerCards) {
                playerCard.setDamagePoints(30);
            }
        }
    }
}
