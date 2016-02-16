package com.imooc.problems;

/**
 * Created by ningzeda on 2/16/2016.
 * ????
 */
public class MaximalSquare {

    public int maxSquare(int[][] matrix) {

        if (matrix == null || matrix.length == 0)
            return 0;

        int row = matrix.length;
        int col = matrix[0].length;

        int[][] results = new int[row][col];
        for (int i = 0; i < col; i++)
            results[0][i] = matrix[0][i];
        for (int j = 0; j < row; j++)
            results[j][0] = matrix[j][0];

        int max = matrix[0][0];
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (matrix[i][j] == 0)
                    results[i][j] = 0;
                else {
                    results[i][j] = Math.min(results[i - 1][j], Math.min(results[i - 1][j - 1], results[i][j - 1])) + 1;  //????
                    max = max > results[i][j] ? max : results[i][j];
                }

            }
        }

        return max * max;
    }
}
