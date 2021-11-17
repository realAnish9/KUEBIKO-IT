package com.kuebikoit.ticTac;

import com.kuebikoit.ticTac.constants.TicTacToeConstants;
import com.kuebikoit.ticTac.handler.PlayerHandler;
import com.kuebikoit.ticTac.models.RowCol;
import com.kuebikoit.ticTac.pinter.Printer;
import com.kuebikoit.ticTac.players.UserPlayer;
import com.kuebikoit.ticTac.reader.InputReader;
import com.kuebikoit.ticTac.util.Mapper;
import java.util.Random;

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


//         LOOP [
//             Once the player moves, change turn
//             random emppty value
//        ]
        boolean a=true;
        while(a)
        {

            main.turnPromter();
            main.getMove();
            main.intitializeAI();
            main.turnPromter();
            main.computerMove();
            a=main.winChecker();

        }
        main.whoWon();



    }

    public boolean winChecker() {
        String [][]array;
        array = TicTacToeConstants.defaultArray;
        boolean b=true;
        for(int i=0;i<3;i++)
            {
                for(int j=0;j<3;j++)
                {
                    if((array[i][0].equals("X") &&array[i][1].equals("X")&&array[i][2].equals("X"))||(array[i][0].equals("O")&&array[i][1].equals("O")&&array[i][2].equals("O"))) {
                        b = false;
                    }
                    if((array[0][j].equals("X")&&array[1][j].equals("X")&&array[2][j].equals("X"))||(array[0][j].equals("O")&&array[1][j].equals("O")&&array[2][j].equals("O")))
                    {
                        b=false;
                    }
                    if((array[0][0].equals("X")&&array[1][1].equals("X")&&array[2][2].equals("X"))||(array[0][0].equals("O")&&array[1][1].equals("O")&&array[2][2].equals("O"))) {
                        b = false;
                    }
                    if((array[2][0].equals("X")&&array[1][1].equals("X")&&array[0][2].equals("X"))||(array[2][0].equals("O")&&array[1][1].equals("O")&&array[0][2].equals("O"))){
                        b=false;
                    }

                }

            }
        return b;

        }



    public void getMove() {

        RowCol rowCol;
        Integer playerMovePosition = inputReader.readInt(TicTacToeConstants.playerMoveMessagePrompt);
        rowCol = Mapper.mapNumberToRowCol(playerMovePosition);
        while(!playerHandler.validate(rowCol.getRow(), rowCol.getCol())){
            playerMovePosition = inputReader.readInt(TicTacToeConstants.playerMoveMessagePrompt);
            rowCol = Mapper.mapNumberToRowCol(playerMovePosition);
        }
        playerHandler.move(getTurn(), rowCol);
        initializeGame();

    }
    public void computerMove(){
        RowCol rowCol=Mapper.mapNumberToRowCol(((int)(Math.random()*9+1)));
        playerHandler.move(getTurn(),rowCol);
        initializeGame();
        player1.setTurn(true);
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
    public void whoWon(){
        printer.print(TicTacToeConstants.winner+getTurn().getName());
    }

    public void initializeGame(){

        printer.print(TicTacToeConstants.defaultArray);
    }

    public void intitializeAI() {
        player1.setTurn(false);
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
