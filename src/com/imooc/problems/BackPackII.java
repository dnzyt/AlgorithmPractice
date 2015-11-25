package com.imooc.problems;

/**
 * Created by dnzyt on 11/24/2015.
 * 这道题与BackPack类似，只是用一个数组来临时存储value
 */
public class BackPackII {
    public int backPackII(int m, int[] A, int[] V) {
        int N = A.length + 1;
        int M = m + 1;
        int[][] res = new int[N][M];

        for (int i = 1; i < N; i++) {
            for (int j = 1; j < M; j++) {
                if (j < A[i - 1])
                    res[i][j] = res[i - 1][j];
                else {
                    res[i][j] = Math.max(res[i - 1][j - A[i - 1]] + V[i - 1], res[i - 1][j]);
                }
            }
        }

        int max = 0;
        for (int i = M - 1; i >= 0; i--) {
            if (max < res[N - 1][i])
                max = res[N - 1][i];
        }



        return max;
    }

}
