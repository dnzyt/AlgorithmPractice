package com.imooc.problems;

import java.util.ArrayList;

/**
 * Created by dnzyt on 2/29/2016.
 * 动态规划
 * A为修改之前的数组，B为修改之后的数组
 * 在B数组中，每一个位置都可能取1~100中的任何一个值
 * 转移矩阵中i为A数组的索引，j为在i这个位置上可能取的值，matrix[i][j]表示当考虑前i个数，且当第i个位置取值为j时的minimum adjustment cost
 */
public class MinimumAdjustmentCost {
    public int MinAdjustmentCost(ArrayList<Integer> A, int target) {

        if (A == null || A.size() == 0)
            return 0;
        int[][] matrix = new int[A.size()][101];

        for (int i = 0; i < A.size(); i++) {
            for (int j = 0; j < 101; j++) {
                matrix[i][j] = Integer.MAX_VALUE;
                if (i == 0) {
                    matrix[i][j] = Math.abs(j - A.get(i));
                } else {
                    for (int k = 0; k < 101; k++) {
                        if (Math.abs(k - j) > target)
                            continue;

                        //转移矩阵
                        matrix[i][j] = Math.min(matrix[i][j], matrix[i - 1][k] + Math.abs(j - A.get(i)));
                    }
                }


            }
        }

        int res = Integer.MAX_VALUE;
        for (int j = 0; j < 101; j++) {
            res = Math.min(res, matrix[A.size() - 1][j]);
        }



        return res;
    }
}
