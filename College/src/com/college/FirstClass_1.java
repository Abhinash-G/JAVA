package com.college;

import java.sql.SQLOutput;
import java.util.*;

public class FirstClass_1 {

    static int min(int a, int b, int... c){
        int m=(a>b)?b:a;
        for(int z:c) {
            m=(m<z)?m:z;
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 7 numbers");
        int a1=in.nextInt();
        int a2=in.nextInt();
        int a3=in.nextInt();
        int a4=in.nextInt();
        int a5=in.nextInt();
        int a6=in.nextInt();
        int a7=in.nextInt();

        System.out.println(min(a1,a2,a3,a4,a5,a6,a7));
    }
}
