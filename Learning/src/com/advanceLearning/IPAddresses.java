package com.advanceLearning;
import java.util.*;

public class IPAddresses {

    void generate(String temp,boolean valid,int index,String val,List<String> result){
        if(val.length()==index || !valid){
            if(valid){
                result.add(temp);
            }
            return;
        }
        if(temp.isEmpty() || temp.charAt(temp.length()-1)=='.'){
            temp+=val.charAt(index);
            generate(temp,true,index+1,val,result);
        }
        if(temp.lastIndexOf('.')){

        }
    }

    public static void main(String[] args) {

    }

}
