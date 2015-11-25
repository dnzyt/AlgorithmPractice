package com.imooc.problems;

/**
 * Created by ningzeda on 11/25/2015.
 */
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        if (prices.length == 0)
            return 0;

        int min = prices[0];
        int max = prices[0];
        int res = 0;

        for (int i = 1; i < prices.length; i++) {
            int temp = prices[i];
            if (temp < min) {
                min = temp;
                max = temp;
            } else if (temp > max) {
                max = temp;
                res = Math.max(res, max - min);
            }


        }


        return res;
    }

}
