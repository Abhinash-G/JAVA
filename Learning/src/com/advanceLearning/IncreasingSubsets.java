package com.advanceLearning;

import java.util.*;

public class IncreasingSubsets {

     void generate(List<Integer> a, int[] num, int index,Set<List<Integer>> result){
        if(index==num.length){
            if(a.size()>=2) {
                System.out.println(a);
                result.add(new ArrayList<>(a));
            }
            return;
        }

        generate(a,num,index+1,result);

        if(a.isEmpty() || a.get(a.size()-1)<= num[index]){
            a.add(num[index]);
            generate(a,num,index+1,result);
            a.remove(a.size()-1);
        }


    }
    void call(){
        int[] nums={1,3,5,4};
        Set<List<Integer>> result=new HashSet<>();
        List<Integer> n=new ArrayList<>();
        generate(n,nums,0,result);
        System.out.println(new ArrayList<>(result));
    }

    public static void main(String args[]){
        IncreasingSubsets ob =new IncreasingSubsets();
        ob.call();
        }
    }


