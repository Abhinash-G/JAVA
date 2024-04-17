package com.DP.Medium;

public class Q62 {
    public int uniquePaths(int m, int n) {
        if(m==1 || n==1)
            return 1;
        int[][] result=new int[m][n];
        for(int i=0;i<m;i++)
            result[i][n-1]=1;
        for(int i=0;i<n;i++)
            result[m-1][i]=1;
        for(int row=m-2;row>=0;row--){
            for(int col=n-2;col>=0;col--){
                result[row][col]=(result[row+1][col]+result[row][col+1]);
            }
        }
        return result[0][0];
    }

    public static void main(String[] args) {
        Q62 ob=new Q62();
        System.out.println(ob.uniquePaths(1,7));
        System.out.println(ob.uniquePaths(3,7));
        System.out.println(ob.uniquePaths(4,4));
        System.out.println(ob.uniquePaths(1,1));
        System.out.println(ob.uniquePaths(2,3));
    }
}
