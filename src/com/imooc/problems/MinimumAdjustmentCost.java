package com.imooc.problems;

import java.util.ArrayList;

/**
 * Created by dnzyt on 2/29/2016.
 * ��̬�滮
 * AΪ�޸�֮ǰ�����飬BΪ�޸�֮�������
 * ��B�����У�ÿһ��λ�ö�����ȡ1~100�е��κ�һ��ֵ
 * ת�ƾ�����iΪA�����������jΪ��i���λ���Ͽ���ȡ��ֵ��matrix[i][j]��ʾ������ǰi�������ҵ���i��λ��ȡֵΪjʱ��minimum adjustment cost
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

                        //ת�ƾ���
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
