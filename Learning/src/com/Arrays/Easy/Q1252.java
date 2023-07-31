package com.Arrays.Easy;

import java.util.Arrays;

public class Q1252 {
    public int oddCells(int m, int n, int[][] indices) {

        //        O((n+m)^indices.length) time.
        {
//        int[] answer=new int[m][n];
//        int[] answer=new int[m*n];
//        int numOfOdd=0;
//            for (int i = 0; i < indices.length; i++) {
//                for (int j = 0; j < n; j++) {
//                    answer[indices[i][0]][j]++;
//                }
//                for (int k = 0; k < m; k++)
//                    answer[k][indices[i][1]]++;
//            }
//            for (int[] a : answer) {
//                for (int b : a) {
//                    if (b % 2 != 0)
//                        numOfOdd++;
//                }
//            }
        }

//        O(n+m+indices.length) time.
        {
            int[] r=new int[m];
            int[] c=new int[n];
            for(int i=0;i< indices.length;i++){
                r[indices[i][0]]++;
                c[indices[i][1]]++ ;
            }
            //Count odd rows
            int oddRows = 0;
            for(int i =0; i < m; i++) {
                if(r[i]%2 == 1) {
                    oddRows++;
                }
            }

            //count odd columns
            int oddColumns = 0;
            for(int i =0; i < n; i++){
                if(c[i]%2 == 1) {
                    oddColumns++;
                }
            }

            //return Final value
            return oddRows * n + oddColumns * m - 2*oddRows*oddColumns;
        }
    }

    public static void main(String[] args) {
        int[][] answer=new int[2][2];
        for(int[] a:answer)
            System.out.println(Arrays.toString(a));
    }
}
