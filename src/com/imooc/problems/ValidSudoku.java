package com.imooc.problems;

import java.util.ArrayList;

/**
 * Created by dnzyt on 11/21/2015.
 */
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        int row = board.length;
        int col = board[0].length;

        for (int i = 0; i < row; i++) {
            if (!isRowValid(board, i) || !isColumnValid(board, i))
                return false;
        }

        for (int i = 0; i < row; i += 3) {
            for (int j = 0; j < col; j+= 3) {
                if (!isValid(board, i, j))
                    return false;
            }
        }

        return true;
    }


    private boolean isValid(char[][] board, int m, int n) {
        ArrayList<Character> container = new ArrayList<>();
        for (int i = m; i < m + 3; i++) {
            for (int j = n; j < n + 3; j++) {
                if (board[i][j] == '.')
                    continue;
                else if (!container.contains(board[i][j]))
                    container.add(board[i][j]);
                else
                    return false;
            }
        }

        return true;
    }

    private boolean isRowValid(char[][] board, int row) {
        ArrayList<Character> container = new ArrayList<>();
        for (int j = 0; j < board[row].length; j++) {
            if (board[row][j] == '.')
                continue;
            else if (!container.contains(board[row][j]))
                container.add(board[row][j]);
            else
                return false;
        }

        return true;
    }

    private boolean isColumnValid(char[][] board, int col) {
        ArrayList<Character> container = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == '.')
                continue;
            else if (!container.contains(board[i][col]))
                container.add(board[i][col]);
            else
                return false;
        }
        return true;
    }
}
