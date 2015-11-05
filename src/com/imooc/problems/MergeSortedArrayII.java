package com.imooc.problems;

import java.util.ArrayList;

/**
 * Created by dnzyt1986 on 11/4/2015.
 */
public class MergeSortedArrayII {

    public ArrayList<Integer> mergeSortedArray(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A == null || A.size() == 0)
            return B;
        if (B == null || B.size() == 0)
            return A;

        ArrayList<Integer> res = new ArrayList<>();
        int pa = 0;
        int pb = 0;
        while (pa < A.size() && pb < B.size()) {
            if (A.get(pa) < B.get(pb)) {
                res.add(A.get(pa++));
            } else {
                res.add(B.get(pb++));
            }
        }
        while (pa < A.size()) {
            res.add(A.get(pa++));
        }

        while (pb < B.size()) {
            res.add(B.get(pb++));
        }


        return res;
    }
}
