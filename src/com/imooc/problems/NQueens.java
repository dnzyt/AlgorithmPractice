package com.imooc.problems;

import java.util.ArrayList;

/**
 * Created by ningzed on 3/24/16.
 *
 * 关键在于每一行只能有一个棋子
 *
 */
public class NQueens {
    ArrayList<ArrayList<String>> solveNQueens(int n) {
        ArrayList<ArrayList<String>> results = new ArrayList<>();
        int[] positions = new int[n];

        helper(results, positions, n, 0);




        return results;
    }

    private void helper(ArrayList<ArrayList<String>> results, int[] positions, int n, int row) {
        for (int i = 0; i < n; i++) {
            if (isValid(positions, row, i)) {
                positions[row] = i;

                if (row == n - 1) {
                    results.add(getSolution(positions));
                    positions[row] = 0;
                    return;
                }
                helper(results, positions, n, row + 1);
                positions[row] = 0;
            }
        }


        return;
    }

    private ArrayList<String> getSolution(int[] positions) {
        ArrayList<String> solution = new ArrayList<>();
        for (int i = 0; i < positions.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < positions.length; j++) {
                if (j == positions[i]) {
                    sb.append("Q");
                } else {
                    sb.append(".");
                }
            }
            solution.add(sb.toString());
        }
        return solution;
    }

    private boolean isValid(int[] positions, int row, int col) {
        for (int i = 0; i < row; i++) {
            int tempCol = positions[i];
            if (tempCol == col) //same column
                return false;
            if (Math.abs(tempCol - col) == Math.abs(row - i)) //xie xian shang
                return false;
        }

        return true;
    }
}
