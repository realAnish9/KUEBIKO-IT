package com.kubeikoit.ticTac.printer;

import com.kubeikoit.ticTac.constants.TicTacToeContants;

public class Printer implements PrinterIF {


    @Override
    public void print(String message) {

    }

    @Override
    public void print(String[][] array) {
        //printing logic here

        //check null poiner

        if(array != null){
            for(int row =0; row<array.length; row ++) {
                for (int col = 0; col < array[row].length; col++) {
                    System.out.print(TicTacToeContants.DOUBLE_TAB);
                    System.out.print(array[row][col]);
                }
                System.out.print(TicTacToeContants.DOUBLE_LINE);
            }
        }
    }
}
