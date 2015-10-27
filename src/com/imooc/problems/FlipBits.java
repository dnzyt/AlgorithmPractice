package com.imooc.problems;

/**
 * Created by dnzyt on 10/26/2015.
 */
public class FlipBits {
    public int bitSwapRequired(int a, int b) {
        if (a == b) return 0;

        int c = a ^ b;

        return countOnes(c);


    }

    private int countOnes(int a) {

        int count = 0;
        while (a != 0) {
            a = a & (a - 1);
            count++;
        }

        return count;
    }





}
