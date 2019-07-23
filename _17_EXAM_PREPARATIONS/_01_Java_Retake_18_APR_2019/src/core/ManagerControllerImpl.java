package core;

import core.interfaces.ManagerController;
import models.battleFields.BattleFieldImpl;
import models.battleFields.interfaces.Battlefield;
import models.cards.MagicCard;
import models.cards.TrapCard;
import models.cards.interfaces.Card;
import models.players.Advanced;
import models.players.Beginner;
import models.players.interfaces.Player;
import repositories.CardRepositoryImpl;
import repositories.PlayerRepositoryImpl;
import repositories.interfaces.CardRepository;
import repositories.interfaces.PlayerRepository;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import static common.ConstantMessages.*;

public class ManagerControllerImpl implements ManagerController {

    private PlayerRepository players;
    private CardRepository cards;
    private Battlefield battleField;


    public ManagerControllerImpl() {
        this.players = new PlayerRepositoryImpl();
        this.cards = new CardRepositoryImpl();
        this.battleField = new BattleFieldImpl();
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
            case "Trap":
                Card newTrapCard = new TrapCard(name);
                newTrapCard.setDamagePoints(120);
                newTrapCard.setHealthPoints(5);
                this.cards.add(newTrapCard);
                break;
            case "Magic":
                Card newMagicCard = new MagicCard(name);
                newMagicCard.setDamagePoints(5);
                newMagicCard.setHealthPoints(80);
                this.cards.add(newMagicCard);
                break;
        }
        return String.format(SUCCESSFULLY_ADDED_CARD, type, name);
    }

    @Override
    public String addPlayerCard(String username, String cardName) {
        List<Card> copyOfCardRepo = (LinkedList)((LinkedList<Card>)this.cards.getCards()).clone();
        Card searchedCard = null;
        for (Card card : copyOfCardRepo) {
            if(card.getName().equals(cardName)){
                searchedCard = card;
                break;
            }
        }
        Player searchedPLayer = null;
        for (Player player : players.getPlayers()) {
            if(player.getUsername().equals(username)){
                searchedPLayer = player;
                break;
            }
        }

        searchedPLayer.getCardRepository().add(searchedCard);
        return String.format(SUCCESSFULLY_ADDED_PLAYER_WITH_CARDS, cardName, username);
    }

    @Override
    public String fight(String attackUser, String enemyUser){
        Player attackPlayer =  this.players.find(attackUser);
        Player enemyPlayer = this.players.find(enemyUser);

        battleField.fight(attackPlayer, enemyPlayer);

        return String.format(FIGHT_INFO, attackPlayer.getHealth(), enemyPlayer.getHealth());
    }


    @Override
    public String report() {
        StringBuilder strBuilder = new StringBuilder();

        for (Player p : this.players.getPlayers()) {
            strBuilder.append(String.format(PLAYER_REPORT_INFO,p.getUsername(), p.getHealth(), p.getCardRepository().getCount()) + "\n");
            for (Card c : p.getCardRepository().getCards()) {
                strBuilder.append(String.format(CARD_REPORT_INFO,c.getName(), c.getDamagePoints()) + "\n");
            }
            strBuilder.append(DEFAULT_REPORT_SEPARATOR + "\n");
        }
        return strBuilder.toString();
    }
}
