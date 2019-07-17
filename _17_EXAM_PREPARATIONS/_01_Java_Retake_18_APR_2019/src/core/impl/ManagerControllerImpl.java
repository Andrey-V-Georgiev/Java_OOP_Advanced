package core.impl;

import core.interfaces.ManagerController;
import models.battleFields.impl.BattleFieldImpl;
import models.battleFields.interfaces.Battlefield;
import models.cards.impl.MagicCard;
import models.cards.impl.TrapCard;
import models.cards.interfaces.Card;
import models.players.impl.Advanced;
import models.players.impl.Beginner;
import models.players.interfaces.Player;
import repositories.impl.CardRepositoryImpl;
import repositories.impl.PlayerRepositoryImpl;
import repositories.interfaces.CardRepository;
import repositories.interfaces.PlayerRepository;

import java.util.ArrayList;
import java.util.List;

import static common.ConstantMessages.*;


public class ManagerControllerImpl implements ManagerController {

    private PlayerRepository players;
    private List<Card> cards;
    private Battlefield battleField;

    public ManagerControllerImpl() {
        this.players = new PlayerRepositoryImpl();
        this.cards = new ArrayList<>();
        this.battleField = new BattleFieldImpl();

        //TODO:IMPLEMENT ME
    }

    @Override
    public String addPlayer(String type, String username) {
        CardRepository newCardRepository = new CardRepositoryImpl();
        switch (type) {
            case "Beginner":
                Player newBeginner = new Beginner(newCardRepository, username);
                this.players.add(newBeginner);
                break;
            case "Advanced":
                Player newAdvanced = new Advanced(newCardRepository, username);
                this.players.add(newAdvanced);
                break;
        }
        return String.format(SUCCESSFULLY_ADDED_PLAYER, type, username);
    }

    @Override
    public String addCard(String type, String name) {
        switch (type) {
            case "TrapCard":
                Card newTrapCard = new TrapCard(name);
                this.cards.add(newTrapCard);
                break;
            case "MagicCard":
                Card newMagicCard = new MagicCard(name);
                this.cards.add(newMagicCard);
                break;
        }
        return String.format(SUCCESSFULLY_ADDED_PLAYER_WITH_CARDS, type, name);
    }

    @Override
    public String addPlayerCard(String username, String cardName) {
        for (Card card : cards) {
            if (card.getName().equals(cardName)) {
                for (Player player : players.getPlayers()) {
                    if (player.getUsername().equals(username)) {
                        player.getCardRepository().add(card);
                        return String.format(SUCCESSFULLY_ADDED_PLAYER_WITH_CARDS, cardName, username);
                    }
                }
            }
        }
        return null;
    }

    @Override
    public String fight(String attackUser, String enemyUser) {
        Player attackPlayer = null;
        Player enemyPlayer = null;

        int attackUserHealth = 0;
        int enemyUserHealth = 0;
        for (Player p : this.players.getPlayers()) {
            if (p.getUsername().equals(attackUser)) {
                attackPlayer = p;
                attackUserHealth = p.getHealth();
            }
        }
        for (Player p : this.players.getPlayers()) {
            if (p.getUsername().equals(enemyUser)) {
                enemyPlayer = p;
                enemyUserHealth = p.getHealth();
            }
        }

        battleField.fight(attackPlayer, enemyPlayer);
        return String.format(FIGHT_INFO, attackUserHealth, enemyUserHealth);
    }

    @Override
    public String report() {
        StringBuilder strBuilder = new StringBuilder();
        for (Player p : this.players.getPlayers()) {
            strBuilder.append(String.format(PLAYER_REPORT_INFO, p.getUsername(), p.getHealth(), p.getCardRepository().getCount()));
            for (Card c : p.getCardRepository().getCards()) {
                strBuilder.append(String.format(CARD_REPORT_INFO, c.getName(), c.getDamagePoints()));
            }
            strBuilder.append(DEFAULT_REPORT_SEPARATOR);
        }
        return strBuilder.toString();
    }
}
