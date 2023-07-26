package com.Arrays.Medium;

import java.util.Arrays;

public class Q885 {
    public static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int len=rows*cols,k=1,stepsAlloud=1,currentR=rStart,currentC=cStart;
        int[][] result = new int[len][2];
        result[0][0]=rStart;
        result[0][1]=cStart;
        while(k<len){
            //To move right.
            for(int i=0;i<stepsAlloud;i++){
                currentC++;
                if(currentC<cols && currentR<rows && currentC>-1 && currentR>-1){
                    result[k][0]=currentR;
                    result[k][1]=currentC;
                    k++;
                }
            }
            //To move down.
            for(int i=0;i<stepsAlloud;i++){
                currentR++;
                if(currentC<cols && currentR<rows && currentC>-1 && currentR>-1){
                    result[k][0]=currentR;
                    result[k][1]=currentC;
                    k++;
                }
            }
            stepsAlloud++;
            //To move left
            for(int i=0;i<stepsAlloud;i++){
                currentC--;
                if(currentC<cols && currentR<rows && currentC>-1 && currentR>-1){
                    result[k][0]=currentR;
                    result[k][1]=currentC;
                    k++;
                }
            }
            //To move up.
            for(int i=0;i<stepsAlloud;i++){
                currentR--;
                if(currentC<cols && currentR<rows && currentC>-1 && currentR>-1){
                    result[k][0]=currentR;
                    result[k][1]=currentC;
                    k++;
                }
            }
            stepsAlloud++;
        }
        System.gc();
        return result;
    }

    public static void main(String[] args) {
//        for (int[] a:spiralMatrixIII(5,6,1,4))
        for (int[] a:spiralMatrixIII(1,4,0,0))
            System.out.print(Arrays.toString(a)+" ");
    }
}
