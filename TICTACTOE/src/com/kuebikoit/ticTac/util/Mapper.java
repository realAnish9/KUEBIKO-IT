package com.kuebikoit.ticTac.util;

import com.kuebikoit.ticTac.models.RowCol;

import static com.kuebikoit.ticTac.constants.TicTacToeConstants.ARRAY_LENGTH;

public class Mapper {

    public static RowCol mapNumberToRowCol(int num) {

        int row = -1;
        int col = -1;
        int counter=0;


        for(int i =0;i<ARRAY_LENGTH;i++){
            for(int j=0;j<ARRAY_LENGTH;j++){
                counter+=1;
                if (counter==num){
                    row=i;
                    col=j;
                }
            }
        }
        return  new RowCol(row, col);
    }

}
