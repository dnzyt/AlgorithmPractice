package com.imooc.problems;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by dnzyt on 12/28/2015.
 */
public class CountOfSmallerNumber {
    public ArrayList<Integer> countOfSmallerNumber(int[] A, int[] queries) {
        ArrayList<Integer> res = new ArrayList<>();
        if (A == null || A.length == 0) {
            for (int a: queries)
                res.add(0);
            return res;
        }

        Arrays.sort(A);

        for (int key: queries) {
            int start = 0;
            int end = A.length - 1;
            int mid = 0;
            while (start <= end) {
                mid = (start + end) / 2;
                if (A[mid] < key) {
                    start = mid + 1;
                } else if (A[mid] > key) {
                    end = mid - 1;
                } else {
                    break;
                }
            }
            if (A[mid] == key) {
                while (mid > 0 && A[mid - 1] == key) //处理重复元素
                    mid--;
                res.add(mid);
            }
            else if (A[mid] < key) {
                while (mid + 1 < A.length && A[mid + 1] == A[mid]) //处理重复元素
                    mid++;
                res.add(mid + 1);
            }
            else {
                while (mid > 0 && A[mid - 1] == A[mid]) //处理重复元素
                    mid--;
                res.add(mid);
            }


        }
        return res;
    }
}
