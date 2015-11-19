package com.imooc.problems;

/**
 * Created by dnzyt on 11/18/2015.
 *
 * 动态规划
 * 先求出上一层的各个取值的最小值，然后再确定当前层的各个位置的最小值
 */
public class Triangle {
    public int minimumTotal(int[][] triangle) {

        int len = triangle.length;
        int[] temp = new int[triangle.length];

        for (int i = 0; i < len; i++) {
            for (int j = i; j >= 0; j--) {
                if (j == 0) {

                    temp[j] = triangle[i][j] + temp[j];
                } else if (j == i) {
                    temp[j] = triangle[i][j] + temp[j - 1];
                } else {
                    temp[j] = (triangle[i][j] + temp[j - 1]) < (triangle[i][j] + temp[j]) ? (triangle[i][j] + temp[j - 1]) : (triangle[i][j] + temp[j]);
                }
            }
        }
        int min = temp[0];
        for (int i = 1; i < len; i++) {
            if (temp[i] < min)
                min = temp[i];
        }

        return min;
    }
}
