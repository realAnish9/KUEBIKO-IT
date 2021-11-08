package com.kuebikoit.ticTac.handler;

import com.kuebikoit.ticTac.models.RowCol;
import com.kuebikoit.ticTac.players.UserPlayer;

public interface PlayerHandlerIf {

    boolean isTurn(UserPlayer userPlayer);
    int move(UserPlayer userPlayer, RowCol rowCol);
}
