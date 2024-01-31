package com.Arrays.Hard;

import java.util.Arrays;
import java.util.HashMap;
//incomplete.
public class Q1499 {
    public static int findMaxValueOfEquation(int[][] points, int k) {
        int max=Integer.MIN_VALUE;
        for(int i= points.length-1;i>0;i--){
            int j=i-1;
            while(points[j][0]<=k-points[i][0]){
                    max=Math.max(max,(points[i][0]+points[i][1]+(points[j][1]-points[j][0])));
                    j--;
            }
//             for(int j=1;j<=k;j++){
//                 if(i+j< points.length){
//                     int temp=Math.abs((points[i][0]-points[i+j][0]));
//                     if(temp<=k){
//                         max=Math.max(max,(points[i][1]+points[i+j][1]+temp));
//                     }
//                 }
//             }
        }
        return max;
    }

    public static void main(String[] args) {
//        int[][] points={{1,3},{2,0},{5,10},{6,-10}};
//        System.out.println(findMaxValueOfEquation(points,1));
//        int[][] points={{0,0},{3,0},{9,2}};
//        System.out.println(findMaxValueOfEquation(points,3));
        int[][] points={{-19,9},{-15,-19},{-5,-8}};
        System.out.println(findMaxValueOfEquation(points,10));
    }
}
