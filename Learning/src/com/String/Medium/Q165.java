package com.String.Medium;

public class Q165 {

//    If version1 < version2, return -1.
//    If version1 > version2, return 1.
//    Otherwise, return 0.

    public static int compareVersion(String version1, String version2) {
        if(version1.isEmpty() && version2.isEmpty())
            return 0;
        else if (version1.isEmpty()) {
            for(char ch:version2.toCharArray()){
                if(ch!='.'&& ch!='0')
                    return -1;
            }
            return  0;
        }
        else if (version2.isEmpty()){
            for(char ch:version1.toCharArray()){
                if(ch!='.' && ch!='0')
                    return 1;
            }
            return  0;
        }
        else{
            int indexV1=version1.indexOf('.');
            int indexV2=version2.indexOf('.');
            int v1=(indexV1==-1)?Integer.parseInt(version1):Integer.parseInt(version1.substring(0,indexV1));
            int v2=(indexV2==-1)?Integer.parseInt(version2):Integer.parseInt(version2.substring(0,indexV2));
            if(v1==v2)
                return compareVersion((indexV1==-1)?"":version1.substring(indexV1+1),(indexV2==-1)?"":version2.substring(indexV2+1));
            if(v1>v2)
                return 1;
            else
                return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(Q165.compareVersion("19.8.3.17.5.01.0.0.4.0.0.0.0.0.0.0.0.0.0.0.0.0.00.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.000000.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.000000","19.8.3.17.5.01.0.0.4.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0000.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.000000"));
    }
}
