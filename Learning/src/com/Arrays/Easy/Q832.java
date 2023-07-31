package com.Arrays.Easy;

public class Q832 {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i< image.length;i++){
            image[i]=flip(image[i]);
        }
        return image;
    }
    private int[] flip(int[] array){
        for(int i=0;i< array.length/2;i++){
            int temp=array[i];
            array[i]= array[array.length-1-i];
            array[array.length-1-i]=temp;
        }
        array=invert(array);
        return array;
    }
    private int[] invert(int[] array){
        for(int i=0;i<array.length;i++){
            array[i]=(array[i]==0)?1:0;
        }
        return array;
    }
}
