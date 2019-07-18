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

import java.util.Optional;

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
                this.cards.add(newTrapCard);
                break;
            case "Magic":
                Card newMagicCard = new MagicCard(name);
                this.cards.add(newMagicCard);
                break;
        }
        return String.format(SUCCESSFULLY_ADDED_PLAYER_WITH_CARDS, type, name);
    }

    @Override
    public String addPlayerCard(String username, String cardName) {
        Card searchesCard = null;
        for (Card card : this.cards.getCards()) {
            if(card.getName().equals(cardName)){
                searchesCard = card;
            }
        }
        Player searchedPLayer = null;
        for (Player player : players.getPlayers()) {
            if(player.getUsername().equals(username)){
                searchedPLayer = player;
            }
        }
        searchedPLayer.getCardRepository().add(searchesCard);
        this.players
                .find(username)
                .getCardRepository()
                .getCards()
                .forEach(c -> {
                    c.setHealthPoints(c.getHealthPoints() + 40);
                    c.setDamagePoints(c.getDamagePoints() + 30);
                });
        return String.format(SUCCESSFULLY_ADDED_PLAYER_WITH_CARDS, cardName, username);
    }

    @Override
    public String fight(String attackUser, String enemyUser) {
        Optional<Player> attackPlayer = this.players
                .getPlayers()
                .stream()
                .filter(p -> p.getUsername().equals(attackUser))
                .findFirst();

        Optional<Player> enemyPlayer = this.players
                .getPlayers()
                .stream()
                .filter(p -> p.getUsername().equals(enemyUser))
                .findFirst();

        try{
            battleField.fight(attackPlayer.get(), enemyPlayer.get());
        } catch(Exception e){
            System.out.println(e.getMessage());
        }

        return String.format(FIGHT_INFO, attackPlayer.get().getHealth(), enemyPlayer.get().getHealth());
    }

    @Override
    public String report() {
        StringBuilder strBuilder = new StringBuilder();
        for (Player p : this.players.getPlayers()) {
            strBuilder.append(String.format(PLAYER_REPORT_INFO, p.getUsername(), p.getHealth(), p.getCardRepository().getCount()) + "\n");
            for (Card c : p.getCardRepository().getCards()) {
                strBuilder.append(String.format(CARD_REPORT_INFO, c.getName(), c.getDamagePoints()) + "\n");
            }
            strBuilder.append(DEFAULT_REPORT_SEPARATOR + "\n");
        }
        return strBuilder.toString();
    }
}
