package com.kuebiko.tictactoe4.service;

import com.kuebiko.tictactoe4.models.History;
import com.kuebiko.tictactoe4.models.Player;
import com.kuebiko.tictactoe4.util.IdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TicTacToeService implements TicTacToeServiceIf{
    @Autowired
    RemoteHistoryService rhs;


    @Override
    public Player createNewPlayer(Player player) {
        String newId = IdGenerator.generateId();
        player.setId(newId);
        return player;
    }

    @Override
    public Player updatePlayer(Player player) {
        History history = createHistory(player);
        rhs.saveRemoteHistory(history);
        return null;
    }

    private History createHistory(Player player){
        History history = new History();
        history.setGameId(player.getId());
        history.setWinner(player.isWinner());
        return history;

    }
}
