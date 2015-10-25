package com.imooc.problems;

/**
 * Created by dnzyt on 10/25/2015.
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        if (n == 3)
            return 3;

        int[] array = new int[n];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        for (int i = 3; i < n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }

        return array[n - 1];
    }

}
