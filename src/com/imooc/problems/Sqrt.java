package com.imooc.problems;

/**
 * Created by dnzyt on 11/16/2015.
 */
public class Sqrt {
    public int sqrt(int x) {
        long start = 1, end = x;
        while (start + 1 < end) {
            long mid = start + (end - start) / 2;
            if (mid * mid <= x) {
                start = mid;
            } else {
                end = mid;
            }
        }

        //处理x=0时候的情况
        if (end * end <= x) {
            return (int) end;
        }
        return (int) start;
    }


}
