package com.kuebikoit.ticTac.util;

import com.kuebikoit.ticTac.models.RowCol;

public class Mapper {

    public static RowCol mapNumberToRowCol(int num) {

        int row = -1;
        int col = -1;

        switch (num) {

            case 1:
                row = 0;
                col = 0;
                break;
            case 2:
                row = 0;
                col = 1;
                break;
            case 3:
                row = 0;
                col = 2;
                break;
            case 4:
                row = 1;
                col = 0;
                break;
            case 5:
                row = 1;
                col = 1;
                break;
            case 6:
                row = 1;
                col = 2;
                break;
            case 7:
                row = 2;
                col = 0;
                break;
            case 8:
                row = 2;
                col = 1;
                break;
            case 9:
                row = 2;
                col = 2;
                break;
            default:

        }
        return  new RowCol(row, col);
    }

}
