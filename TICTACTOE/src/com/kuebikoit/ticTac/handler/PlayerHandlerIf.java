package com.kuebikoit.ticTac.handler;

import com.kuebikoit.ticTac.players.UserPlayer;

public interface PlayerHandlerIf {

    boolean isTurn(UserPlayer userPlayer);
    void move(UserPlayer userPlayer, int row, int col);
}
