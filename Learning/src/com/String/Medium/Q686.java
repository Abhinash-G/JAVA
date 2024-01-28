package com.String.Medium;

public class Q686 {
        public int repeatedStringMatch(String a, String b) {
            if(a.contains(b))
                return 1;
            int count=1;
            String result=a;
            for(int i=0;i<b.length();i++){
                char ch=b.charAt(i);
                if(a.indexOf(ch)==-1)
                    return -1;
            }
            do{
                ++count;
                result+=a;
            }while(result.length()<=2*b.length() && !result.contains(b));
            if(result.contains(b))
                return count;
            else
                return -1;
        }
}
