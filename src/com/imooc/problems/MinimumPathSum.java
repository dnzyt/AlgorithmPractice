package com.imooc.problems;

/**
 * Created by ningzed on 11/5/15.
 *
 * 这题不能用递归，会造成Time Limit Exceeded
 */
public class MinimumPathSum {

    public int minPathSum(int[][] grid) {
        if (grid == null)
            return 0;

        int row = grid.length;
        int col = grid[0].length;
        int[][] res = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0 && j == 0) {
                    res[i][j] = grid[i][j];
                    continue;
                }

                if (i - 1 < 0) {
                    res[i][j] = res[i][j - 1] + grid[i][j];
                    continue;
                }

                if (j - 1 < 0) {
                    res[i][j] = res[i - 1][j] + grid[i][j];
                    continue;
                }
                
                res[i][j] = Math.min(res[i - 1][j], res[i][j - 1]) + grid[i][j];

            }
        }
        return res[row - 1][col - 1];
    }



    /*
    private int minSum(int[][] grid, int m, int n) {
        if (m < 0 || n < 0)
            return 0;
        if (m == 0) {
            int res = 0;
            for (int i = 0; i <= n; i++) {
                res += grid[0][i];
            }
            return res;
        }

        if (n == 0) {
            int res = 0;
            for (int i = 0; i <= m; i++) {
                res += grid[i][0];
            }
            return res;
        }


        return grid[m][n] + Math.min(minSum(grid, m, n - 1), minSum(grid, m - 1, n));
    }
    */
}
