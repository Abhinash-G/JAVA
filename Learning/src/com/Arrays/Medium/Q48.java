package com.Arrays.Medium;

import java.util.Arrays;


public class Q48 {
    public int[] reverse(int[] nums){
        for(int i=0;i< nums.length/2;i++){
            int temp=nums[i];
            nums[i]=nums[nums.length-1-i];
            nums[nums.length-1-i]=temp;
        }
        return nums;
    }
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length-1;i++){
            for(int j=i+1;j< matrix.length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        System.out.println("Transpose");
        for(int[] i:matrix)
            System.out.println(Arrays.toString(i));
        for(int i=0;i<matrix.length;i++){
            matrix[i]=reverse(matrix[i]);
        }
    }

    public static void main(String[] args) {
        Q48 ob=new Q48();
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Before");
        for(int[] i:matrix)
            System.out.println(Arrays.toString(i));
        ob.rotate(matrix);
        System.out.println("Answer");
        for(int[] i:matrix)
        System.out.println(Arrays.toString(i));
    }
}
