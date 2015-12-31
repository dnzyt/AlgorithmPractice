package com.imooc.problems;

/**
 * Created by dnzyt on 12/30/2015.
 */
public class DigitCounts {
    public int digitCounts(int k, int n) {
        int count = 0;
        if (k == 0)
            count++;
        for (int i = 0; i <= n; i++) {
            count += numberOfValue(k, i);
        }

        return count;
    }

    private int numberOfValue(int k, int value) {
        int remainder = 0;
        int count = 0;
        while (value != 0) {
            remainder = value % 10;
            value /= 10;
            if (remainder == k)
                count++;
        }

        return count;
    }
}
