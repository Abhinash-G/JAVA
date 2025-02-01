package com.String.Medium;

public class Q6 {

    public String convert(String s, int numRows) {
        if(s.length()==1 || numRows>=s.length() || numRows==1)
            return s;
        StringBuilder result=new StringBuilder();
        int pointer=1,down=0,up=0;
        while (numRows>0){
            int count=1;
            int index=pointer-1;
            down=(numRows-1)*2;
            up=(pointer-1)*2;
            if(up==0){
                while (index<s.length()){
                    result.append(s.charAt(index));
                    index+=down;
                }
            }
            else if(down==0){
                while (index<s.length()){
                    result.append(s.charAt(index));
                    index+=up;
                }
            }
            else {
                while (index<s.length()){
                    result.append(s.charAt(index));
                    index+=down;
                    if(index<s.length()){
                        result.append(s.charAt(index));
                        index+=up;
                    }
                }
            }
            numRows--;
            pointer++;
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Q6 object=new Q6();
        System.out.println(object.convert("abcdefghi",2));
        System.out.println(object.convert("ab",3));
        System.out.println(object.convert("abc",3));
        System.out.println(object.convert("abcdefg",3));
    }
}
