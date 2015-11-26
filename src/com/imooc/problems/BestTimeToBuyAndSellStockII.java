package com.imooc.problems;

/**
 * Created by dnzyt on 11/25/2015.
 *
 * �����ҵ���һ������㣬 Ȼ���ҵ�ÿһ������㣬�ڽ�����ʱ��ʼ����
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
