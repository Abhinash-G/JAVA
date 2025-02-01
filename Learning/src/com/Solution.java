import java.util.*;
public class Solution{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int length=5;
        int[] arr={1,2,3,5,4};
//        for(int i=0;i<length;i++){
//            arr[i]=in.nextInt();
//        }
        Solution.discount(arr);
    }
    public static void discount(int[] arr){
        int[] result=new int[arr.length];
        int start=0,end;
        for(end=1;end<arr.length;end++){
            if(arr[start]<arr[end])
                continue;
            while(start<end){
                result[start]=arr[start]-arr[end];
                start++;
            }
        }
        while(start<end){
            result[start]=arr[start];
            start++;
        }
        System.out.println(Arrays.toString(result));
    }
}