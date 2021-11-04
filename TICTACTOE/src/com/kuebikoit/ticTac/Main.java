package com.kuebikoit.ticTac;

import com.kuebikoit.ticTac.constants.TicTacToeConstants;
import com.kuebikoit.ticTac.handler.PlayerHandler;
import com.kuebikoit.ticTac.models.RowCol;
import com.kuebikoit.ticTac.printer.Printer;
import com.kuebikoit.ticTac.players.UserPlayer;
import com.kuebikoit.ticTac.reader.InputReader;
import com.kuebikoit.ticTac.util.Mapper;

import java.util.Random;

import static com.kuebikoit.ticTac.constants.TicTacToeConstants.ARRAY_LENGTH;

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
        main.turnPrompter();
        main.getMove();
        main.initializeAI();

//         LOOP [
//             Once the player moves, change turn
//             random emppty value
//        ]







    }

    public void aiMove(){
        Random rand=new Random();
        boolean rightValue=false;
        int row=-1;
        int col=-1;
        while(!rightValue){
           row=rand.nextInt(ARRAY_LENGTH);
           int col=rand.nextInt(ARRAY_LENGTH);
           rightValue=playerHandler.validate(row,col);
        }
        playerHandler.move(getTurn(),);
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

    public void turnPrompter() {

        printer.print(TicTacToeConstants.playerTurnPrompt + getTurn().getName());
    }

    public void initializeGame(){

        printer.print(TicTacToeConstants.defaultArray);
    }

    public void initializeAI() {
        aiPlayer.setName("Computer");
        aiPlayer.setSymbol("O");
        aiPlayer.setTurn(true);
        aiPlayer.setSymbol("0");
    }

    public void initializePlayers(){
        String playerName = inputReader.read(TicTacToeConstants.playerNameMessagePrompt);
        player1.setName(playerName);
        player1.setTurn(true);
        player1.setSymbol("X");
        //printer.print(player1.getName());
    }

}
