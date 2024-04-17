package com.DP.Medium;

public class Q152 {
    public int maxProduct(int[] nums) {
        if(nums.length==1)
            return nums[0];
        int currProduct=1,maxProduct=-11;
        if (numberOfNegative(nums) % 2 != 0) {
            for (int i = 0; i < nums.length; i++) {
                currProduct *= nums[i];
                if (currProduct > maxProduct)
                    maxProduct = currProduct;
                if (currProduct <= 0){
                    currProduct = 1;
                }
            }
        }
        else{
            for (int i = 0; i < nums.length; i++) {
                currProduct *= nums[i];
                if (currProduct > maxProduct)
                    maxProduct = currProduct;
                if (currProduct == 0)
                    currProduct = 1;
            }
        }
        return maxProduct;
    }
    private int[] reverseP(int[] nums){
        int[] result=new int[nums.length];
        result[nums.length-1]=1;
        for(int i=nums.length-2;i>=0;i--){
            result[i]=nums[i+1]*result[i+1];
        }
        return result;
    }

    private int product(int[] nums){
        int[] reverse=reverseP(nums);
        int currProduct=1,maxProduct=-11;
        for (int i = 0; i < nums.length; i++) {
            currProduct *= nums[i];
            if (currProduct > maxProduct) {
                maxProduct = currProduct;
            }
            if (currProduct <0) {
                if(reverse[i]>=0) {
                    currProduct=1;
                }
            }
            if (currProduct == 0)
                currProduct = 1;
            System.out.println(nums[i]+":  "+currProduct+"  "+maxProduct);
        }
        return maxProduct;
    }

    private int numberOfNegative(int[] nums) {
        int count=0;
        for(int i:nums){
            if(i<0)
            ++count;
        }
        return count;
    }

    public static void main(String[] args) {
        Q152 ob=new Q152();
//        System.out.println(ob.maxProduct(new int[]{-6,1,2,3,-4,-5}));
//        System.out.println(ob.product(new int[]{-3,0,1,-2}));
        System.out.println(ob.product(new int[]{-3,-1,-1}));
//        System.out.println(ob.maxProduct(new int[]{6,1,2,3,-4,-5}));
    }
}
