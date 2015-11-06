package com.imooc.problems;

/**
 * Created by ningzeda on 11/6/2015.
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            int temp = 0;
            if (i == digits.length - 1) {
                temp = digits[i] + 1;
            } else {
                temp = digits[i] + carry;
            }

            carry = temp / 10;
            digits[i] = temp % 10;
            if (carry == 0)
                return digits;
        }

        if (carry == 1) {
            int[] res = new int[digits.length + 1];
            res[0] = carry;

            for (int i = 0; i < digits.length; i++) {
                res[i + 1] = digits[i];
            }
            return res;
        }




        return null;
    }




}
