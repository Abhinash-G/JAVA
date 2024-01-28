package com.BinarySearch.Medium;


import java.util.Arrays;

public class Q167 {
    private static  int binarySearch(int arr[], int x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == x)
                return m;
            if (arr[m] < x)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }
    public static int[] twoSum(int[] numbers, int target) {
        if(numbers.length==2)
            return new int[]{1,2};
        for(int i=0;i< numbers.length;i++){
            int next=binarySearch(numbers,target-numbers[i]);
            if(next!=-1 && next!=i)
                return new int[]{i+1,next+1};
//                return new int[]{Math.min(i+1,next+1),Math.max(i+,next+1)};
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
//        int[] a1=twoSum(new int[]{5,25,75},100);
//        System.out.println(Arrays.toString(a1));
//        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15},9)));
        System.out.println(Arrays.toString(twoSum(new int[]{1,2,3,4,4,9,56,90},8)));
    }
}
