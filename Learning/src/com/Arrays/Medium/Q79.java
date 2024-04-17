package com.Arrays.Medium;

import java.util.HashSet;

public class Q79 {
//    public boolean exist(char[][] board, String word) {
//        if(word.length()>(board.length*board[0].length))
//            return false;
//        int ptr=0,length=word.length();
//        for(int i=0;i<board.length;i++){
//            for(int j =0;j< board[i].length;i++){
//                if(board[i][j]==word.charAt(0)){
//                    if(check(board,i,j,word))
//                        return true;
//                }
//            }
//        }
//        return false;
//    }

//    private boolean check(char[][] board, int row, int col, String word) {
//        HashSet<int[]> set=new HashSet<>();
//        int pointer=1;
//        while(pointer<word.length()){
//            if(board[row].length<col+1 && board[row][col+1]==word.charAt(pointer)){
//                col+=1;
//                int[] temp=new int[]{row,col};
//                if(!set.contains(temp)) {
//                    set.add(temp);
//                    continue;
//                }
//                else{
//
//                }
//            }
//        }
//    }

    
    public boolean exist(char[][] board, String word) {

        boolean[][] visited = new boolean[board.length][board[0].length];
        char[] wordChar = word.toCharArray();

        if (wordChar.length > board.length * board[0].length)
            return false;

        int[] counts = new int[256];

        for (char[] chars : board) {
            for (int j = 0; j < board[0].length; j++) {
                counts[chars[j]]++;
            }
        }

        int len = wordChar.length;
        for(int i=0; i<len/2; i++) {
            if(counts[wordChar[i]] > counts[wordChar[len - 1 - i]]) {
                for(int j=0; j<len/2; j++) {
                    char temp = wordChar[j];
                    wordChar[j] = wordChar[len - 1 - j];
                    wordChar[len - 1 - j] = temp;
                }
                break;
            }
        }

        for (char c : wordChar) {
            if (--counts[c] < 0)
                return false;
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (visit(board, wordChar, 0, i, j, visited))
                    return true;
            }
        }
        return false;
    }

    private boolean visit(char[][] board, char[] word, int start, int x, int y, boolean[][] visited) {
        if (start == word.length)
            return true;

        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length || visited[x][y])
            return false;

        if (word[start] != board[x][y])
            return false;

        visited[x][y] = true;
        boolean found = visit(board, word, start + 1, x + 1, y, visited)
                || visit(board, word, start + 1, x - 1, y,  visited)
                || visit(board, word, start + 1, x, y + 1,  visited)
                || visit(board, word, start + 1, x, y - 1,  visited);

        visited[x][y] = false;

        return found;
    }
}
