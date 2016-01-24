package com.imooc.problems;

/**
 * Created by dnzyt on 1/23/16.
 */
public class IntegerToRoman {
    public String intToRoman(int n) {
        if(n <= 0) {
            return "";
        }
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder res = new StringBuilder();
        int digit = 0;
        while (n != 0) {
            int times = n / nums[digit];
            n -= nums[digit] * times;
            for (int i = 0; i < times; i++) {
                res.append(symbols[digit]);
            }
            digit++;
        }


        return res.toString();
    }

}
