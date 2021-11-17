package com.kuebikoit.ticTac.handler;

import com.kuebikoit.ticTac.constants.TicTacToeConstants;
import com.kuebikoit.ticTac.models.RowCol;
import com.kuebikoit.ticTac.players.UserPlayer;
import com.kuebikoit.ticTac.reader.InputReader;

public class PlayerHandler implements PlayerHandlerIf {

    @Override
    public boolean isTurn(UserPlayer userPlayer) {
        return userPlayer.isTurn();
    }

    @Override
    public void move(UserPlayer userPlayer, RowCol rowCol) {
      boolean isValid = validate(rowCol.getRow(), rowCol.getCol());
      if(isValid)
      {
          if (TicTacToeConstants
                  .defaultArray[rowCol.getRow()][rowCol.getCol()].equals("*")) {
                TicTacToeConstants
                      .defaultArray[rowCol.getRow()][rowCol.getCol()] = userPlayer.getSymbol();
          }
          else{
              System.out.println(TicTacToeConstants.wrongPlacePrompt);
          }
      }

    }

    public boolean validate(int row, int col){

        if (row!=-1 && col!=-1)
            return true;

        return false;

    }
}
