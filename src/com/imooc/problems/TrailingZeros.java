package com.imooc.problems;

/**
 * Created by dnzyt on 11/18/2015.
 */
public class TrailingZeros {
    public long trailingZeros(long n) {
        long count = 0;
        while (n != 0) {
            count += (n / 5);
            n = n / 5;
        }






        return count;
    }

}
