package com.imooc.problems;

/**
 * Created by dnzyt on 12/31/2015.
 *
 * 整数近似除法：32/3 = 10

 显然求近似除法可以用乘法来二分查找：32 ~ 3*10 = 3*[1*(2^3) + 0*(2^2) + 1*(2^1) + 0*(2^0)]

 res = 0

 1. 先找到a使x*2^a <= y < x*2^(a+1)，res += 2^a，y = y - x*2^a   (这里y为dividend, x为divisor, a为最高次幂

 2. if(y >= x*2^(a-1) {res+=2^(a-1); y = y - x*2^(a-1);}

 3. if(y >= x*2^(a-2) {res+=2^(a-2); y = y - x*2^(a-2);}
 *
 *
 */
public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {

        if (divisor == 0)
            return dividend >= 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        boolean isNegative = false;
        if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0))
            isNegative = true;

        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);
        long originDvs = dvs;

        int exponent = 0;
        while (dvd >= dvs << (exponent + 1)) {
            exponent++;
        }

        int res = 0;
        while (dvd >= originDvs) {
            if (dvd >= dvs << exponent) {
                dvd -= dvs << exponent;
                res += 1 << exponent;
            }
            exponent--;
        }

        return isNegative ? 0 - res : res;
    }
}
