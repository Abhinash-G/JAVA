package com.Arrays.Medium;

import java.util.HashSet;

public class Q36 {
    private static boolean checkDuplicateInBox(char[][] board,int start_row,int start_col){
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<3;i++)
            for (int j=0;j<3;j++) {
                if(board[start_row+i][start_col+j]!='.'){
                    if (set.contains(board[start_row + i][start_col + j]))
                        return true;
                    set.add(board[start_row + i][start_col + j]);
                }
            }
        return false;
    }
    private static boolean checkDuplicateInRowAndCol(char[][] board, int value) {
        HashSet<Character> setCol=new HashSet<>();
        for(int i=0;i<9;i++){
            if(board[i][value]!='.'){
                if (setCol.contains(board[i][value]))
                    return true;
                setCol.add(board[i][value]);
            }
        }
        HashSet<Character> setRow=new HashSet<>();
        for(int i=0;i<9;i++){
            if(board[value][i]!='.'){
                if (setRow.contains(board[value][i]))
                    return true;
                setRow.add(board[value][i]);
            }
        }
        return false;
    }

//    private static boolean checkDuplicateInRow(char[][] board, int row) {
//        HashSet<Character> set=new HashSet<>();
//        for(int i=0;i<9;i++){
//            if(board[row][i]!='.'){
//                if (set.contains(board[row][i]))
//                    return true;
//                set.add(board[row][i]);
//            }
//        }
//        return false;
//    }
    public static boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3) {
                if (checkDuplicateInBox(board, i, j))
                    return false;
            }
        }
        for(int i=0;i<9;i++){
            if(checkDuplicateInRowAndCol(board,i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
//        char[][] box={{'5','3','.','.','7','.','.','.','.'}
//                ,{'6','.','.','1','9','5','.','.','.'}
//                ,{'.','9','8','.','.','.','.','6','.'}
//                ,{'8','.','.','.','6','.','.','.','3'}
//                ,{'4','.','.','8','.','3','.','.','1'}
//                ,{'7','.','.','.','2','.','.','.','6'}
//                ,{'.','6','.','.','.','.','2','8','.'}
//                ,{'.','.','.','4','1','9','.','.','5'}
//                ,{'.','.','.','.','8','.','.','7','9'}};

        char[][] box={{'8','3','.','.','7','.','.','.','.'}
                ,{'6','.','.','1','9','5','.','.','.'}
                ,{'.','9','5','.','.','.','.','6','.'}
                ,{'5','.','.','.','6','.','.','.','3'}
                ,{'4','.','.','8','.','3','.','.','1'}
                ,{'7','.','.','.','2','.','.','.','6'}
                ,{'.','6','.','.','.','.','2','8','.'}
                ,{'.','.','.','4','1','9','.','.','5'}
                ,{'.','.','.','.','8','.','.','7','9'}};


        System.out.println(isValidSudoku(box));
    }
}
