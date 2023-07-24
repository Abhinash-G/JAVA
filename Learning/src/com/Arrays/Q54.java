package com.Arrays;
import java.util.*;

public class Q54 {
    public static List<Integer> spiralOrder(int[][] matrix) {
        int len= matrix.length* matrix[0].length;
        List<Integer> result=new ArrayList<>(len);
        int fc=0,fr=0,lc= matrix[0].length-1,lr= matrix.length-1;
        while(lc>=fc && lr>=fr){
            for(int i=fc;i<=lc;i++){
                result.add(matrix[fr][i]);
            }
            ++fr;
            for(int i=fr;i<=lr;i++) {
                result.add(matrix[i][lc]);
            }
            lc--;
            for(int i=lc;i>fc;i--){
                result.add(matrix[lr][i]);
            }
            for(int i=lr;i>=fr;i--){
                result.add(matrix[i][fc]);
            }
            lr--;
            ++fc;

        }
        return result;
    }

    public static void main(String[] args) {
//        System.out.println(spiralOrder(new int[][]{{1,2,3,4},{10,11,12,5},{9,8,7,6}}));
//        System.out.println(spiralOrder(new int[][]{{1,2,3,4},{12,13,14,5},{11,16,15,6},{10,9,8,7}}));
//        System.out.println(spiralOrder(new int[][]{{1,2,3},{8,9,4},{7,6,5}}));
        System.out.println(spiralOrder(new int[][]{{1},{2}}));
    }
}
