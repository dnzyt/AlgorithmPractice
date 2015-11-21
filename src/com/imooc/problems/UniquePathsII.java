package com.imooc.problems;

/**
 * Created by dnzyt on 11/20/2015.
 */
public class UniquePathsII {
    public int uniquePathWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;

        if (obstacleGrid[0][0] == 1)
            return 0;


        int[][] res = new int[row][col];

        //在边界上如果有一个障碍，那么后续的位置都是到不了的
        int flag = 1;
        for (int j = 0; j < col; j++) {
            if (obstacleGrid[0][j] == 1)
                flag = 0;
            res[0][j] = flag;
        }

        flag = 1;
        for (int i = 0; i < row; i++) {
            if (obstacleGrid[i][0] == 1)
                flag = 0;
            res[i][0] = flag;
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (obstacleGrid[i][j] == 1) {
                    res[i][j] = 0;
                    continue;
                }
                res[i][j] = res[i - 1][j] + res[i][j - 1];

            }
        }

        return res[row - 1][col - 1];
    }
}
