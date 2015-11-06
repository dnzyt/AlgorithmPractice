package com.imooc.problems;

/**
 * Created by dnzyt on 11/5/2015.
 */
public class CheckPowerOfTwo {

    public boolean checkPowerOf2(int n) {
        if (n <= 0)
            return false;

        // write your code here
        if (n == 2 || n == 1)
            return true;
        if (n % 2 == 1)
            return false;
        return checkPowerOf2(n / 2);

    }


}
