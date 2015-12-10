package com.imooc.problems;

import java.util.ArrayList;

/**
 * Created by dnzyt on 12/9/2015.
 */
public class ContinuousSubarraySum {
    public ArrayList<Integer> continuousSubarraySum(int[] A) {
        ArrayList<Integer> res = new ArrayList<>();
        if (A == null || A.length == 0)
            return res;

        int currentLeft = 0;
        int maxLeft = currentLeft;
        int maxRight = 0;

        int tempSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < A.length; i++) {
            tempSum += A[i];

            if (maxSum < tempSum) {
                maxLeft = currentLeft;
                maxRight = i;
                maxSum = tempSum;
            }

            if (tempSum < 0) {
                if (i + 1 <= A.length - 1){
                    currentLeft = i + 1;
                    tempSum = 0;
                }
            }
        }

        res.add(maxLeft);
        res.add(maxRight);


        return res;
    }

}
