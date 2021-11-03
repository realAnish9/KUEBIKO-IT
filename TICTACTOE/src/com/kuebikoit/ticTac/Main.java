package com.kuebikoit.ticTac;

import com.kuebikoit.ticTac.constants.TicTacToeConstants;
import com.kuebikoit.ticTac.handler.PlayerHandler;
import com.kuebikoit.ticTac.models.RowCol;
import com.kuebikoit.ticTac.pinter.Printer;
import com.kuebikoit.ticTac.players.UserPlayer;
import com.kuebikoit.ticTac.reader.InputReader;
import com.kuebikoit.ticTac.util.Mapper;

public class Main {

    private UserPlayer player1 = new UserPlayer();
    private UserPlayer aiPlayer = new UserPlayer();
    PlayerHandler playerHandler = new PlayerHandler();

    Printer printer = new Printer();

    InputReader inputReader = new InputReader();

    public static void main(String[] args) {
        Main main = new Main();
        main.initializeGame();
        main.initializePlayers();
        main.turnPromter();
        main.getMove();

//         LOOP [
//             Once the player moves, change turn
//             random emppty value
//        ]







    }

    public void getMove() {

        Integer playerMovePosition = inputReader.readInt(TicTacToeConstants.playerMoveMessagePrompt);
        RowCol rowCol = Mapper.mapNumberToRowCol(playerMovePosition);
        playerHandler.move(getTurn(), rowCol);
        initializeGame();

    }

    public UserPlayer getTurn() {

        if(player1.isTurn()) {
            return player1;
        } else {
            return aiPlayer;
        }
    }

    public void turnPromter() {

        printer.print(TicTacToeConstants.playerTurnPrompt + getTurn().getName());
    }

    public void initializeGame(){

        printer.print(TicTacToeConstants.defaultArray);
    }

    public void intitializeAI() {
        aiPlayer.setName("Computer");
        aiPlayer.setSymbol("O");
    }

    public void initializePlayers(){
        String playerName = inputReader.read(TicTacToeConstants.playerNameMessagePrompt);
        player1.setName(playerName);
        player1.setTurn(true);
        player1.setSymbol("X");
        printer.print(player1.getName());
    }

}
