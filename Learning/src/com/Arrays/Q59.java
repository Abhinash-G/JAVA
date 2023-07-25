package com.Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Q59 {
    public static int[][] generateMatrix(int n) {
        int result[][]=new int[n][n];
        int c=1,i=0,j=0,firstRow=1,firstColumn=0,lastRow=n-1,lastColumn=n-1,moveInRow=0,moveInColumn=1;
        while(c<=n*n){
            result[i][j]=c;
            if(moveInColumn==1 && j==lastColumn){
                moveInColumn=0;
                --lastColumn;
                moveInRow=1;
            } else if (moveInRow==1 && i==lastRow) {
                moveInRow=0;
                lastRow--;
                moveInColumn=-1;
            } else if (moveInColumn==-1 && j==firstColumn) {
                moveInColumn=0;
                firstColumn++;
                moveInRow=-1;
            } else if (moveInRow==-1 && i==firstRow ) {
                moveInRow=0;
                moveInColumn=1;
                firstRow++;
            }
            i+=moveInRow;
            j+=moveInColumn;
            c++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] result=generateMatrix(17);
        for(int[] r:result)
            System.out.println(Arrays.toString(r));
    }
}
