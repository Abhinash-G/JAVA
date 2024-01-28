package com.Arrays.Medium;
/*You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.*/
public class Q11 {
    public static int maxArea(int[] height) {
        if(height.length==2)
            return Math.min(height[0],height[1]);
        int left_wall=0,right_wall=height.length-1,max_water=0;
        while(left_wall<right_wall){
            max_water=Math.max(max_water,((right_wall-left_wall))*Math.min(height[right_wall],height[left_wall]));
            if(height[left_wall]<height[right_wall])
                left_wall++;
            else
                right_wall--;
        }
        return max_water;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
