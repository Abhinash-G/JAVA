package com.Arrays.Hard;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q42 {
    private static void reverse(int[] array){
        for(int i=0;i<array.length/2;i++){
            int temp=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=temp;
        }
    }
    public static int trap(int[] height) {
        if(height.length==1 || height.length==2)
            return 0;
        int wall=0,water=0;
        while(wall< height.length-1){
            int runner=wall+1;
            if(height[runner]>height[wall]){
                ++wall;
                continue;
            }
            int tempWater=0;
            while(runner< height.length && height[runner]<height[wall]){
                tempWater+=height[wall]-height[runner];
                ++runner;
            }
            if(runner==height.length){
                if(height[runner-1]>=height[wall]){
                    water+=tempWater;
                    break;
                }
                else{
                    int[] reverse= Arrays.copyOfRange(height,wall,height.length);
                    reverse(reverse);
                    water+=trap(reverse);
                    break;
                }
            }
            else{
                wall=runner;
                water+=tempWater;
            }
        }
        return water;
    }

    public static void main(String[] args) {
        System.out.println(Q42.trap(new int[]{3,2,0,4,6,8,1,6,0}));
    }
}
