package com.kuebiko.tictactoe4.service;

import com.kuebiko.tictactoe4.models.Player;
import com.kuebiko.tictactoe4.util.IdGenerator;
import org.springframework.stereotype.Component;

@Component
public class TicTacToeService implements TicTacToeServiceIf{
    @Override
    public Player createNewPlayer(Player player) {
        String newId = IdGenerator.generateId();
        player.setId(newId);
        return player;
    }

    @Override
    public Player updatePlayer(Player player) {
        return null;
    }
}
