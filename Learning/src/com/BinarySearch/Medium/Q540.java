package com.BinarySearch.Medium;

import java.rmi.dgc.VMID;

public class Q540 {
    public static int singleNonDuplicate(int[] nums) {
        int min=0,max= nums.length-1,mid=0;
        while(min<=max){
            if(min==max) {
                return nums[min];
            }
            if((max-min+1)==3)
                return (nums[min]==nums[min+1])?nums[max]:nums[min];
            mid=(min+max)/2;
            if(mid%2==0 && nums[mid]==nums[mid+1]) {
                min=mid+2;
            }
            else if(mid%2!=0 && nums[mid]==nums[mid+1])
                max=mid-1;
            else if(mid%2==0 && nums[mid]!=nums[mid+1])
                max=mid;
            else if(mid%2!=0 && nums[mid]!=nums[mid+1]) {
                min = mid+1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
//        //1
//        System.out.println(singleNonDuplicate(new int[]{1}));
//        System.out.println("\n"+"3 series");
//        //3
//        System.out.println(singleNonDuplicate(new int[]{0,0,1}));
//        System.out.println(singleNonDuplicate(new int[]{0,1,1}));
//        System.out.println("\n"+"5 series");
//        //5
//        System.out.println(singleNonDuplicate(new int[]{0,0,1,1,2}));
//        System.out.println(singleNonDuplicate(new int[]{0,0,1,2,2}));
//        System.out.println(singleNonDuplicate(new int[]{0,1,1,2,2}));
//        System.out.println("\n"+"9 series");
//        //9
//        System.out.println(singleNonDuplicate(new int[]{0,1,1,2,2,3,3,4,4}));
//        System.out.println(singleNonDuplicate(new int[]{0,0,1,2,2,3,3,4,4}));
//        System.out.println(singleNonDuplicate(new int[]{0,0,1,1,2,3,3,4,4}));
//        System.out.println(singleNonDuplicate(new int[]{0,0,1,1,2,2,3,4,4}));
//        System.out.println(singleNonDuplicate(new int[]{0,0,1,1,2,2,3,3,4}));
//        System.out.println("\n"+"11 series");

//        //11
//        System.out.println(singleNonDuplicate(new int[]{0,1,1,2,2,3,3,4,4,5,5}));
//        System.out.println(singleNonDuplicate(new int[]{0,0,1,2,2,3,3,4,4,5,5}));
//        System.out.println(singleNonDuplicate(new int[]{0,0,1,1,2,3,3,4,4,5,5}));
//        System.out.println(singleNonDuplicate(new int[]{0,0,1,1,2,2,3,4,4,5,5}));
//        System.out.println(singleNonDuplicate(new int[]{0,0,1,1,2,2,3,3,4,5,5}));
//        System.out.println(singleNonDuplicate(new int[]{0,0,1,1,2,2,3,3,4,4,5}));
//        System.out.println("\n"+"13 series");
//        //13
//        System.out.println(singleNonDuplicate(new int[]{0,1,1,2,2,3,3,4,4,5,5,6,6}));
//        System.out.println(singleNonDuplicate(new int[]{0,0,1,2,2,3,3,4,4,5,5,6,6}));
//        System.out.println(singleNonDuplicate(new int[]{0,0,1,1,2,3,3,4,4,5,5,6,6}));
//        System.out.println(singleNonDuplicate(new int[]{0,0,1,1,2,2,3,4,4,5,5,6,6}));
//        System.out.println(singleNonDuplicate(new int[]{0,0,1,1,2,2,3,3,4,5,5,6,6}));
//        System.out.println(singleNonDuplicate(new int[]{0,0,1,1,2,2,3,3,4,4,5,6,6}));
//        System.out.println(singleNonDuplicate(new int[]{0,0,1,1,2,2,3,3,4,4,5,5,6}));
        
    }
}
