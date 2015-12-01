package com.imooc.problems;

/**
 * Created by ningzeda on 12/1/2015.
 *
 * ��̬�滮
 * ͨ��ÿһ��ʱ�������������Ϊ��ߺ��ұ������֣��ֱ�������߲��ֵĽ������ֵ���ұ߲��ֵĽ������ֵ
 * Ȼ���ҵ�ӵ����ߺ��ұ߽���ֵ����ܵõ����ֵ�ĵ㣬����������ֵ
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

        //��̬�滮�����ÿһ������󲿷������ֵ
        for (int i = 1; i < prices.length; i++) {
            left[i] = Math.max(left[i - 1], prices[i] - min);
            min = Math.min(min, prices[i]);
        }


        //���ÿһ���Ҳ��ֵ������ֵ
        for (int i = prices.length - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], max - prices[i]);
            max = Math.max(max, prices[i]);

        }

        return;
    }
}
