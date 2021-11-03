package com.kuebikoit.ticTac.pinter;

import com.kuebikoit.ticTac.constants.TicTacToeConstants;

public class Printer implements PrinterIf {


    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public void print(String[][] array) {
        // printing logic here

        // Check null pointer'
        if(array != null) {

            for(int row = 0; row < array.length; row ++ ) {

                for(int col = 0 ; col < array[row].length; col++) {
                    System.out.print(TicTacToeConstants.DOUBLE_TAB);
                    System.out.print(array[row][col]);
                }

                System.out.print(TicTacToeConstants.DOUBLE_NEW_LINE);

            }
        }


    }
}
