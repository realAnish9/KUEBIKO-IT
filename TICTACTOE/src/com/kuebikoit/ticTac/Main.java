package com.kuebikoit.ticTac;

import com.kuebikoit.ticTac.constants.TicTacToeConstants;
import com.kuebikoit.ticTac.pinter.Printer;
import com.kuebikoit.ticTac.players.UserPlayer;
import com.kuebikoit.ticTac.reader.InputReader;

public class Main {

    private UserPlayer player1 = new UserPlayer();
    private UserPlayer aiPlayer = new UserPlayer();

    Printer printer = new Printer();

    InputReader inputReader = new InputReader();

    public static void main(String[] args) {
        Main main = new Main();
        main.initializeGame();
        main.initializePlayers();

        // INititalize ai player and user player
        // First turn goes to player
        // Handle player moveme
        // Bonus: AI move handling
        // Check if game complete
        // iF complete, print winner
        // Restart game
    }

    public void initializeGame(){

        printer.print(TicTacToeConstants.defaultArray);
    }

    public void initializePlayers(){
        String playerName = inputReader.read(TicTacToeConstants.playerNameMessagePrompt);
        player1.setName(playerName);
        printer.print(player1.getName());
    }

}
