package com.kuebikoit.ticTac.handler;

import com.kuebikoit.ticTac.constants.TicTacToeConstants;
import com.kuebikoit.ticTac.players.UserPlayer;

public class PlayerHandler implements PlayerHandlerIf {

    @Override
    public boolean isTurn(UserPlayer userPlayer) {
        return userPlayer.isTurn();
    }

    @Override
    public void move(UserPlayer userPlayer, int row, int col) {
        boolean isValid = validate(row, col);
        if(isValid) {
            TicTacToeConstants
                    .defaultArray[row][col] = userPlayer.getSymbol();
        }

    }

    private boolean validate(int row, int col){

        //Please implement the logic here

        return false;

    }
}
