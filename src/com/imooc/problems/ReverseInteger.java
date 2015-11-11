package com.imooc.problems;

/**
 * Created by dnzyt1986 on 11/10/2015.
 */
public class ReverseInteger {
    public int reverseInteger(int n) {
        int num = Math.abs(n);
        int res = 0;
        while (num != 0) {
            if (res > (Integer.MAX_VALUE - num % 10) / 10)
                return 0;
            res = (res * 10) + num % 10;
            num = num / 10;
        }
        return n > 0 ? res : -res;
    }



}
