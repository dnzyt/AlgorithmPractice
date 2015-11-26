package com.imooc.problems;

/**
 * Created by dnzyt on 11/25/2015.
 *
 * 首先找到第一个升序点， 然后找到每一个降序点，在降序点的时候开始交易
 *
 */
public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        if (prices.length == 0)
            return 0;

        int index = -1;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] > prices[i + 1])
                continue;
            else {
                index = i;
                break;
            }
        }

        if (index == -1)
            return 0;


        int res = 0;
        int min = prices[index];
        int max = prices[index];

        for (int i = index + 1; i < prices.length; i++) {
            int temp = prices[i];
            if (temp < max) {
                res += (max - min);
                min = temp;
                max = temp;
            } else {
                max = temp;
            }

        }
        res += (max - min);


        return res;
    }
}
