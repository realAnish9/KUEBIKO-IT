package com.kubeikoit.ticTac;

import com.kubeikoit.ticTac.constants.TicTacToeContants;
import com.kubeikoit.ticTac.printer.Printer;

public class Main {

    public static void main(String[] args) {
        initializeGame();
    }

    public static void initializeGame(){
        Printer printer = new Printer();
        printer.print(TicTacToeContants.defultArray);
    }
}
