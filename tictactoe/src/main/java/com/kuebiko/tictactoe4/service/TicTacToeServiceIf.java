package com.kuebiko.tictactoe4.service;

import com.kuebiko.tictactoe4.models.Player;

public interface TicTacToeServiceIf {
    public Player createNewPlayer(Player player);
    public Player updatePlayer(Player player);
}
