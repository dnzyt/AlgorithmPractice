package com.imooc.problems;

/**
 * Created by dnzyt on 11/18/2015.
 *
 * ��̬�滮
 * �������һ��ĸ���ȡֵ����Сֵ��Ȼ����ȷ����ǰ��ĸ���λ�õ���Сֵ
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
