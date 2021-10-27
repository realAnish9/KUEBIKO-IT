import java.util.*;

public class App {

    public static void printTable(String array[][]){
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
        String [][] table=new String[3][3];

        // fill the array with 0
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                table[i][j]="0";
            }
        }
        printTable(table);
    }
}
