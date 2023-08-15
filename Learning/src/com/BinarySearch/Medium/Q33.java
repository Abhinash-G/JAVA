package com.BinarySearch.Medium;

public class Q33 {
    public static int search(int[] nums, int target) {
        if(nums.length==1)
            return (nums[0]==target)?0:-1;
        if(nums.length==2) {
            if (nums[0]==target) {
                return 0;
            } else if (nums[1]==target)
                return 1;
            else
                return -1;
        }
        int pivot=findPivot(nums),min=0,max=0;
        System.out.println(pivot);
        if(pivot==0){
            min=0;
            max= nums.length-1;
        }
        else if (target<nums[0]) {
            min=pivot;
            max= nums.length-1;
        }
        else{
            min=0;
            max=pivot-1;
        }
        while (min<=max){
            int mid=min+(max-min)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]>target)
                max=mid-1;
            else
                min=mid+1;
        }
        return -1;
    }
    private static int findPivot(int[] num){
        int min=0,max= num.length-1;
        while(min<=max){
            int mid=(min+max)/2;
            if(num[mid]<num[min])
                max=mid;
            else if(num[mid]>num[max])
                min=mid+1;
            else {
                return min;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
//        System.out.println(search(new int[]{4,5,6,1},5));
//        System.out.println(search(new int[]{4,5,6,7,0,1,2},0));
//        System.out.println(search(new int[]{1,3},4));
//        System.out.println(search(new int[]{1},2));
//        System.out.println(search(new int[]{7,0,1,2,3,4,5},0));
//        System.out.println(search(new int[]{5,7,0,0,1,2,3,4,5},0));
    }
}
