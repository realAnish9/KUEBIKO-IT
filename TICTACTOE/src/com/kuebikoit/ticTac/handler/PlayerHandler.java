package com.kuebikoit.ticTac.handler;

import com.kuebikoit.ticTac.constants.TicTacToeConstants;
import com.kuebikoit.ticTac.models.RowCol;
import com.kuebikoit.ticTac.players.UserPlayer;

import java.util.Objects;

import static com.kuebikoit.ticTac.constants.TicTacToeConstants.ARRAY_LENGTH;

public class PlayerHandler implements PlayerHandlerIf {

    @Override
    public boolean isTurn(UserPlayer userPlayer) {
        return userPlayer.isTurn();
    }

    @Override
    public int move(UserPlayer userPlayer, RowCol rowCol) {
      boolean isValid = validate(rowCol.getRow(), rowCol.getCol());
        if(isValid)
        {
            TicTacToeConstants
                    .defaultArray[rowCol.getRow()][rowCol.getCol()] = userPlayer.getSymbol();
            return 1;
        }
        else {
            System.out.println("Invalid Input! Enter again: ");
            return -1;
        }

    }

    public boolean validate(int row, int col){
        return row>=0 && row<ARRAY_LENGTH && col<ARRAY_LENGTH && col>=0 && Objects.equals(TicTacToeConstants.defaultArray[row][col], "*");
    }
}
