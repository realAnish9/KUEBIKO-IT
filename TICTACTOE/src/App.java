import java.util.*;

public class App {

   public static void main (String[]args){

       int row=3;
       int col=3;


       //creating a two dimension array of size 3
       String[][] array = new String[row][col];
       //adding value on array
       addArrayValue(array,row,col);
       printArray(array,row,col);


   }
   public static void addArrayValue(String[][] arr,int row, int col){
       //adding * on array
       for(int i=0; i<row; i++)
       {
           for(int j=0; j<col; j++)
           {
               arr[i][j]= "*";
           }
       }

   }
   public static void printArray(String[][] startArray, int row, int col){
       for(int i=0; i<row; i++)
       {
           for(int j=0; j<col; j++)
           {
               System.out.print(startArray[i][j] + "\t");
           }
           System.out.print("\n");
       }
   }


}

