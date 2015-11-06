package com.imooc.problems;

/**
 * Created by dnzyt on 11/5/2015.
 */
public class NumberOfIslands {

    static int[] dx = {1, 0, 0, -1};
    static int[] dy = {0, 1, -1, 0};

    private int m;
    private int n;

    public int numIslands(boolean[][] grid) {
        m = grid.length;


        if (m == 0)
            return 0;

        n = grid[0].length;
        if (n == 0)
            return 0;

        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j]) {
                    count++;
                    removeIsland(grid, i, j);
                }
            }
        }


        return count;
    }

    private void removeIsland(boolean[][] grid, int x, int y) {
        grid[x][y] = false;
        for (int i = 0; i < 4; i++) {
            int row = x + dx[i];
            int col = y + dy[i];

            if (row >= 0 && col >= 0 && row < m && col < n) {
                if (grid[row][col]) {
                    removeIsland(grid, row, col);
                }
            }
        }

    }

}
