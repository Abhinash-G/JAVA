package com.BinarySearch.Medium;

public class Q81 {
//    public static boolean search(int[] nums, int target) {
//        if(nums.length==1)
//            return (nums[0]==target)?true:false;
//        if(nums.length==2) {
//            if (nums[0]==target || nums[1]==target)
//                return true;
//            else
//                return false;
//        }
//        int pivot=findPivot(nums),min=0,max=0;
//        System.out.println(pivot);
//        if(pivot==0){
//            min=0;
//            max= nums.length-1;
//        }
//        else if (target<nums[0]) {
//            min=pivot;
//            max= nums.length-1;
//        }
//        else{
//            min=0;
//            max=pivot-1;
//        }
//        while (min<=max){
//            int mid=min+(max-min)/2;
//            if(nums[mid]==target)
//                return true;
//            else if(nums[mid]>target)
//                max=mid-1;
//            else
//                min=mid+1;
//        }
//        return false;
//    }
//    private static int findPivot(int[] num) {
//        int min = 0, max = num.length - 1;
//        for(int i=1;i<=max;i++){
//            if(num[min]>=num[i] && !(num[i]>=num[i-1]))
//                min=i;
//        }
//        return min;
//    }

    public static boolean search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
//        System.out.println(search(new int[]{1,0,1,1,1},0));
        System.out.println(search(new int[]{2,5,6,0,0,1,2},0));
        System.out.println(search(new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1},2));
    }
}
