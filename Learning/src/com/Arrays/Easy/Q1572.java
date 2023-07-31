package com.Arrays.Easy;

public class Q1572 {
    public static int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0;i< mat.length;i++){
            sum+=mat[i][i]+mat[i][mat.length-1-i];
        }
        if(mat.length%2!=0)
            sum-=mat[mat.length/2][mat.length/2];
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(diagonalSum(new int[][]{{7,3,1,9},{3,4,6,9},{6,9,6,6},{9,5,8,5}}));
    }
}
