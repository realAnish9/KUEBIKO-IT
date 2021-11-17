package com.kuebikoit.ticTac;

import com.kuebikoit.ticTac.constants.TicTacToeConstants;
import com.kuebikoit.ticTac.handler.PlayerHandler;
import com.kuebikoit.ticTac.models.RowCol;
import com.kuebikoit.ticTac.players.UserPlayer;
import com.kuebikoit.ticTac.printer.Printer;
import com.kuebikoit.ticTac.reader.InputReader;
import com.kuebikoit.ticTac.util.Mapper;

import java.util.Random;

import static com.kuebikoit.ticTac.constants.TicTacToeConstants.*;

public class Main {

    //private static UserPlayer player1;
    private UserPlayer player1 = new UserPlayer();
    private UserPlayer aiPlayer = new UserPlayer();
    PlayerHandler playerHandler = new PlayerHandler();

    Printer printer = new Printer();

    InputReader inputReader = new InputReader();
    public static boolean win=false;

    public static void main(String[] args) {
        Main main = new Main();
        main.initializeGame();
        main.initializePlayers();
        main.initializeAI();

        while(!win && !main.checkDraw()){
            //win= checkWin(main.player1,main.aiPlayer);
            main.turnPrompter();
            main.getMove();
            win= main.checkWin(main.player1,main.aiPlayer);
            if (win){
                break;
            }
            main.turnPrompter();
            main.aiMove();
            win= main.checkWin(main.player1,main.aiPlayer);
        }

    }
    public boolean checkWin(UserPlayer player,UserPlayer Computer) {
        for (int i=0;i<8;i++){
            String line;
            switch (i) {
                case 0:
                    line = defaultArray[0][0] + defaultArray[0][1] + defaultArray[0][2];
                    break;
                case 1:
                    line = defaultArray[1][0] + defaultArray[1][1] + defaultArray[1][2];
                    break;
                case 2:
                    line = defaultArray[2][0] + defaultArray[2][1] + defaultArray[2][2];
                    break;
                case 3:
                    line = defaultArray[0][0] + defaultArray[1][0] + defaultArray[2][0];
                    break;
                case 4:
                    line = defaultArray[0][1] + defaultArray[1][1] + defaultArray[2][1];
                    break;
                case 5:
                    line = defaultArray[0][2] + defaultArray[1][2] + defaultArray[2][2];
                    break;
                case 6:
                    line = defaultArray[0][0] + defaultArray[1][1] + defaultArray[2][2];
                    break;
                case 7:
                    line = defaultArray[0][2] + defaultArray[1][1] + defaultArray[2][0];
                    break;
                default:
                    line = null;
                    break;
            }
            if(line.equals(X+X+X)){
                System.out.println(player.getName()+" is the winner");
                return true;
            }
            else if(line.equals(O+O+O)) {
                System.out.println(Computer.getName()+" is the winner");
                return true;
            }
        }
        return false;
    }

    public boolean checkDraw(){
        for(int i=0;i<ARRAY_LENGTH;i++){
            for(int j=0;j<ARRAY_LENGTH;j++){
                if(defaultArray[i][j].equals("*")){
                    return false;
                }
            }
        }
        System.out.println("Draw");
        return true;
    }


    public void aiMove(){
            Random rand=new Random();
            boolean rightValue=false;
            int row=-1;
            int col=-1;
            while(!rightValue){
               row=rand.nextInt(ARRAY_LENGTH);
               col=rand.nextInt(ARRAY_LENGTH);
               rightValue=playerHandler.validate(row,col);
            }
            playerHandler.move(getTurn(),new RowCol(row,col));
            initializeGame();
            player1.setTurn(true);

    }

    public void getMove() {
            int validity=-1;
            while(validity==-1){
                int playerMovePosition = inputReader.readInt(TicTacToeConstants.playerMoveMessagePrompt);
                RowCol rowCol = Mapper.mapNumberToRowCol(playerMovePosition);
                validity=playerHandler.move(getTurn(), rowCol);
            }
            initializeGame();
            player1.setTurn(false);
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
        aiPlayer.setSymbol(O);
    }

    public void initializePlayers(){
        String playerName = inputReader.read(TicTacToeConstants.playerNameMessagePrompt);
        player1.setName(playerName);
        player1.setTurn(true);
        player1.setSymbol(X);
        //printer.print(player1.getName());
    }

}
