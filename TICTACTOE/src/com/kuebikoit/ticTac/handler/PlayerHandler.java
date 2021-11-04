package com.kuebikoit.ticTac.handler;

import com.kuebikoit.ticTac.constants.TicTacToeConstants;
import com.kuebikoit.ticTac.models.RowCol;
import com.kuebikoit.ticTac.players.UserPlayer;

public class PlayerHandler implements PlayerHandlerIf {

    @Override
    public boolean isTurn(UserPlayer userPlayer) {
        return userPlayer.isTurn();
    }

    @Override
    public void move(UserPlayer userPlayer, RowCol rowCol) {
      //  boolean isValid = validate(rowCol.getRow(), rowCol.getCol());
        // if(isValid)
        {
            TicTacToeConstants
                    .defaultArray[rowCol.getRow()][rowCol.getCol()] = userPlayer.getSymbol();
        }

    }

    private boolean validate(int row, int col){

        //Please implement the logic here

        return false;

    }
}
