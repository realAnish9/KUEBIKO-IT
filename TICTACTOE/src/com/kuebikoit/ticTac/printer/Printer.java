package com.kuebikoit.ticTac.printer;

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

            for (String[] strings : array) {

                for (String string : strings) {
                    System.out.print(TicTacToeConstants.DOUBLE_TAB);
                    System.out.print(string);
                }

                System.out.print(TicTacToeConstants.DOUBLE_NEW_LINE);

            }
        }


    }
}
