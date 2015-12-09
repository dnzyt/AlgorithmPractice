package com.imooc.problems;

/**
 * Created by ningzeda on 12/9/2015.
 * 动态规划，从后往前，res[i]用来存储从i到最后所能获得的最大和
 * 分两种情况，第二个选手取一个，和第二个选手取两个
 * 因为第二个选手每次也都取最优方案，所以第一个选手只能取之前方案中的较小值，即values[i] + Math.min(res[i + 2], res[i + 3])
 *
 */
public class CoinsInALineII {
    public boolean firstWillWin(int[] values) {
        if (values.length <= 2)
            return true;

        int[] res = new int[values.length + 1];
        res[values.length] = 0;
        res[values.length - 1] = values[values.length - 1];
        res[values.length - 2] = values[values.length - 2] + values[values.length - 1];
        res[values.length - 3] = values[values.length - 3] + values[values.length - 2];

        for (int i = values.length - 4; i >= 0; i--) {
            res[i] = values[i] + Math.min(res[i + 2], res[i + 3]);
            res[i] = Math.max(res[i], values[i] + values[i + 1] + Math.min(res[i + 3], res[i + 4]));
        }

        int sum = 0;
        for (int a : values) sum += a;


        return res[0] > sum - res[0];
    }
}
