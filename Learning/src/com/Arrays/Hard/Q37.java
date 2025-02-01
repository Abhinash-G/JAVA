package com.Arrays.Hard;

public class Q37 {
    public void solveSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] != '.') {
                    int num = board[r][c] - '1';
                    rows[r][num] = true;
                    cols[c][num] = true;
                    boxes[3 * (r / 3) + c / 3][num] = true;
                }
            }
        }
        solve(board, 0, 0, rows, cols, boxes);
    }

    private boolean solve(char[][] board, int row, int col, boolean[][] rows, boolean[][] cols, boolean[][] boxes) {
        if (row == 9) return true;
        if (col == 9) return solve(board, row + 1, 0, rows, cols, boxes);
        if (board[row][col] != '.') return solve(board, row, col + 1, rows, cols, boxes);
        for (int num = 0; num < 9; num++) {
            int boxIndex = 3 * (row / 3) + col / 3;
            if (!rows[row][num] && !cols[col][num] && !boxes[boxIndex][num]) {
                board[row][col] = (char) (num + '1');
                rows[row][num] = true;
                cols[col][num] = true;
                boxes[boxIndex][num] = true;
                if (solve(board, row, col + 1, rows, cols, boxes)) {
                    return true;
                }
                board[row][col] = '.';
                rows[row][num] = false;
                cols[col][num] = false;
                boxes[boxIndex][num] = false;
            }
        }
        return false;
    }
}
