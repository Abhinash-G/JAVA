package com.String.Medium;

public class Q38 {
//    public String countAndSay(int n) {
//        if(n==1)
//            return "1";
//        StringBuilder result=new StringBuilder("1");
//        for(int i=1;i<n;i++){
//            int frequency=1,pointer=0;
//            String input=result.toString();
//            result.delete(0,result.length());
//            for(int j=1;j<input.length();j++){
//                if(input.charAt(j)==input.charAt(pointer))
//                    ++frequency;
//                else{
//                    result.append(frequency).append(input.charAt(pointer));
//                    pointer=j;
//                    frequency=1;
//                }
//            }
//            if(frequency!=0){
//                result.append(frequency);
//                result.append(input.charAt(pointer));
//            }
//        }
//        return result.toString();
//    }

    public String countAndSay(int n) {
        if(n==1)
            return "1";
        String input=countAndSay(n-1);
        StringBuilder result = new StringBuilder();
        int frequency = 1, pointer = 0;
        for (int j = 1; j < input.length(); j++) {
            if (input.charAt(j) == input.charAt(pointer))
                ++frequency;
            else {
                result.append(frequency).append(input.charAt(pointer));
                pointer = j;
                frequency = 1;
            }
        }
        result.append(frequency).append(input.charAt(pointer));
        return result.toString();
    }
}
