package com.BinarySearch.Medium;
import java.util.*;
/*
You are given an m x n integer matrix matrix with the following two properties:

        Each row is sorted in non-decreasing order.
                The first integer of each row is greater than the last integer of the previous row.
                Given an integer target, return true if target is in matrix or false otherwise.

                You must write a solution in O(log(m * n)) time complexity.
 */
public class Q74 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int top=0,bottem=matrix.length-1,row=0,left=0,right=matrix[0].length-1,mid=0;
        while(top<bottem){
            if(target>=matrix[mid][0] && target<=matrix[mid][right]) {
//                if (Arrays.binarySearch(matrix[mid], target) >= 0) {
//                    return true;
//                } else
//                    return false;
                break;
            }
            else if(target<=matrix[mid][0])
                bottem=mid-1;
            else
                top=mid+1;
//            mid=(top+bottem)/2;
//            if(matrix[mid][0]<target)
//                top=mid+1;
//            else if (matrix[mid][0]>target)
//                bottem=mid-1;
//            else
//                return true;
        }
        row=mid;
        while(left<=right){
            mid=(left+right)/2;
            if(matrix[row][mid]<target)
                left=mid+1;
            else if(matrix[row][mid]>target)
                right=mid-1;
            else
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(searchMatrix(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,50}},11));
    }

}
