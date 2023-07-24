package com.Arrays;
import java.util.*;

public class Q54 {
    public static List<Integer> spiralOrder(int[][] matrix) {
        int len= matrix.length* matrix[0].length;
        List<Integer> result=new ArrayList<>(len);

        //Method 1 which use a lot of space and time.
        {

//        int fc=0,fr=0,lc= matrix[0].length-1,lr= matrix.length-1;
//        while(result.size()<len) {
//                    for (int i = fc; i <= lc; i++)
//                        result.add(matrix[fr][i]);
//                    ++fr;
//                    if (lr >= fr) {
//                        for (int i = fr; i <= lr; i++) {
//                            result.add(matrix[i][lc]);
//                        }
//                        lc--;
//                        if (lc >= fc) {
//                            for (int i = lc; i > fc; i--) {
//                                result.add(matrix[lr][i]);
//                            }
//                            if (lr >= fr) {
//                                for (int i = lr; i >= fr; i--) {
//                                    result.add(matrix[i][fc]);
//                                }
//                                ++fc;
//                            }
//                            lr--;
//                        }
//                    }
//        }
        }
        //Method 2 which use only 1 loop hence it is less space and time-consuming.(copied)
        {
//            int width = matrix.length;
//            int leng = matrix[0].length;
//            int k = 0;
//            int i = 0;
//            int j = 0;
//            int rowStart = 0;
//            int colStart = 1;
//            int rowEnd = leng - 1;
//            int colEnd = width - 1;
//            int rowOrder = 1; // rowOrder = 1 going right, rowOrder = -1, going left, rowOrder = 0, going up or down
//            int colOrder = 0; // colOrder = 1 going down, colOrder = -1 going up, colOrder = 0, going left or right
//            while (k < leng * width) {
//                result.add(matrix[i][j]);
//                // if going right and this is end of this rightward movement
//                if (rowOrder > 0 && j == rowEnd) {
//                    // next row end should be one less
//                    rowEnd--;
//                    // start moving down
//                    rowOrder = 0;
//                    colOrder = 1;
//                }
//                // if going down and this is end of this downward movement
//                else if (colOrder > 0 && i == colEnd) {
//                    // next col end should be one less
//                    colEnd--;
//                    // start moving left
//                    colOrder = 0;
//                    rowOrder = -1;
//                }
//                // if going left and this is end of this leftward movement
//                else if (rowOrder < 0 && j == rowStart) {
//                    // next row start should be one more
//                    rowStart++;
//                    // start moving up
//                    rowOrder = 0;
//                    colOrder = -1;
//                }
//                // if going up and this is end of this upward movement
//                else if (colOrder < 0 && i == colStart) {
//                    // next col start should be one more
//                    colStart++;
//                    // start moving right
//                    rowOrder = 1;
//                    colOrder = 0;
//                }
//                i+=colOrder;
//                j+=rowOrder;
//                k++;
//            }
        }
        System.gc();
        return result;
    }

    public static void main(String[] args) {
//        System.out.println(spiralOrder(new int[][]{{1,2,3,4},{12,13,14,5},{11,16,15,6},{10,9,8,7}}));
//        System.out.println(spiralOrder(new int[][]{{1,2,3,4},{10,11,12,5},{9,8,7,6}}));
//        System.out.println(spiralOrder(new int[][]{{1,2,3},{8,9,4},{7,6,5}}));
//        System.out.println(spiralOrder(new int[][]{{1,2},{6,3},{5,4}}));
//        System.out.println(spiralOrder(new int[][]{{1,2},{4,3}}));
//        System.out.println(spiralOrder(new int[][]{{1,2,3}}));
//        System.out.println(spiralOrder(new int[][]{{1},{2}}));

    }
}
