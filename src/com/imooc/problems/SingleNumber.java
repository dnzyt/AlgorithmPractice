package com.imooc.problems;

/**
 * Created by ningzeda on 11/15/2015.
 * ����������㽻���ɺͽ����
 */
public class SingleNumber {
    public int singleNumber(int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }

        int res = A[0];
        for (int i = 1; i < A.length; i++) {
            res = res ^ A[i];
        }

        return res;
    }
}
