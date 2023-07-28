package com.Arrays.Medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q73 {
    public static void setZeroes(int[][] matrix) {
        Set<Integer> r=new HashSet<>(matrix.length);
        for(int i=0;i<matrix.length;i++){
            for(int j:matrix[i]){
                if(j==0){
                    r.add(i);
                    break;
                }
            }
        }
        for(int i=0;i<matrix[0].length;i++){
            for(int j=0;j<matrix.length;j++){
                if(matrix[j][i]==0){
                    setZeroesToColumn(matrix,i);
                    break;
                }
            }
        }
        for(int i:r){
            setZeroesToRow(matrix,i);
        }
        System.gc();
    }

    private static void setZeroesToColumn(int[][] matrix, int i) {
        for(int j=0;j<matrix.length;j++){
            matrix[j][i]=0;
        }
    }
    private static void setZeroesToRow(int[][] matrix, int i) {
        for(int j=0;j<matrix[0].length;j++){
            matrix[i][j]=0;
        }
    }

    public static void main(String[] args) {
//        int[][] matrix={{1,1,1},{1,0,1},{1,1,1}};
        int[][] matrix={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(matrix);
        for(int[] i:matrix){
            System.out.println(Arrays.toString(i));
        }
    }
}
