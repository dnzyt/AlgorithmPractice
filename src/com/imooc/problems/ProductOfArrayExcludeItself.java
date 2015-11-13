package com.imooc.problems;

import java.util.ArrayList;

/**
 * Created by dnzyt1986 on 11/8/2015.
 */
public class ProductOfArrayExcludeItself {

    public ArrayList<Long> productExcludeItself(ArrayList<Integer> A) {
        ArrayList<Long> res = new ArrayList<>();
        if (A == null || A.size() == 0 || A.size() == 1)
            return res;

        long[] left = new long[A.size()];
        long[] right = new long[A.size()];

        left[0] = (long)1;
        for (int i = 1; i < A.size(); i++) {
            left[i] = left[i - 1] * A.get(i - 1);
        }

        right[A.size() - 1] = 1;
        for (int i = A.size() - 2; i >= 0; i--) {
            right[i] = right[i + 1] * A.get(i + 1);
        }

        for (int i = 0; i < A.size(); i++) {

            res.add(left[i] * right[i]);

        }





        return res;
    }






}
