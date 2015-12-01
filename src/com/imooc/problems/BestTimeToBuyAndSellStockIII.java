package com.imooc.problems;

/**
 * Created by ningzeda on 12/1/2015.
 *
 * 动态规划
 * 通过每一个时间点把整个数组分为左边和右边两部分，分别计算出左边部分的交易最大值和右边部分的交易最大值
 * 然后找到拥有左边和右边交易值相加能得到最大值的点，进而求出最大值
 */
public class BestTimeToBuyAndSellStockIII {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0)
            return 0;

        int[] left = new int[prices.length];
        int[] right = new int[prices.length];
        divide(prices, left, right);

        int res = 0;
        for (int i = 0; i < prices.length; i++) {
            int temp = left[i] + right[i];
            res = res > temp ? res : temp;
        }

        return res;

    }

    private void divide(int[] prices, int[] left, int[] right) {
        int max = prices[prices.length - 1];
        int min = prices[0];
        int diff = 0;

        //动态规划，求出每一个点的左部分最大交易值
        for (int i = 1; i < prices.length; i++) {
            left[i] = Math.max(left[i - 1], prices[i] - min);
            min = Math.min(min, prices[i]);
        }


        //求出每一点右部分的最大交易值
        for (int i = prices.length - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], max - prices[i]);
            max = Math.max(max, prices[i]);

        }

        return;
    }
}
