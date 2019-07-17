package repositories.impl;

import models.players.interfaces.Player;
import repositories.interfaces.PlayerRepository;

import java.util.List;

import static common.ConstantMessages.*;

public class PlayerRepositoryImpl implements PlayerRepository {
    private List<Player> players;

    @Override
    public int getCount() {
        return this.players.size();
    }

    @Override
    public List<Player> getPlayers() {

        return this.players;
    }

    @Override
    public void add(Player player) {
        if(player == null){
            throw new IllegalArgumentException(PLAYER_CANNOT_BE_NULL);
        }
        Player playerCheck = find(player.getUsername());
        if(playerCheck == null){
            this.players.add(player);
        } else {
            throw new IllegalArgumentException(String.format(PLAYER_ALREADY_EXISTS, player.getUsername()));
        }
    }

    @Override
    public boolean remove(Player player) {
        for (Player p : players) {
            if(player.getUsername().equals(p.getUsername())){
                this.players.remove(player);
                return true;
            }
        }
        return false;
    }

    @Override
    public Player find(String name) {
        for (Player p : players) {
            if(p.getUsername().equals(name)){
                return p;
            }
        }
        return null;
    }
}
