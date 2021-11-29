package com.kuebiko.tictactoe4.service;

import com.kuebiko.tictactoe4.dao.PlayerDao;
import com.kuebiko.tictactoe4.models.Player;
import com.kuebiko.tictactoe4.util.IdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TicTacToeService implements TicTacToeServiceIf{


    @Autowired
    PlayerDao playerDao;

    @Override
    public Player createNewPlayer(Player player) {
        String newId = IdGenerator.generateId();
        player.setId(newId);
        Player savedplayer = playerDao.saveplayer(player);
        return savedplayer;
    }

    @Override
    public Player updatePlayer(Player player) {
       String id = player.getId();
       Player playerFromDatabase = playerDao.getPlayerById(id);
       String name = player.getPlayerName();

       if(name != null){
           playerFromDatabase.setPlayerName(name);
       }
        Character symbol = player.getSymbol();
       if(symbol != null){
           playerFromDatabase.setSymbol(symbol);
       }

       Player updatedPlayer = playerDao.saveplayer(playerFromDatabase);
       return updatedPlayer;
    }
}
