package com.imooc.problems;

import java.util.HashMap;

/**
 * Created by dnzyt on 11/5/2015.
 */
public class PermutationIndex {

    public long permutationIndex(int[] A) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (hash.containsKey(A[i])) {
                hash.put(A[i], hash.get(A[i]) + 1);
            } else {
                hash.put(A[i], 1);
            }
        }

        long res = 0;

        //n-1位如果比n位小，那么n位于n-1交换位置后，剩下的n-1个数全排列，都比原数字小
        //这样以此类推到最后1一位，能计算出比原数字大的数有多少

        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[j] < A[i]) {
                    hash.put(A[j], hash.get(A[j]) - 1);
                    res += numberOfAllPermutation(hash);
                    hash.put(A[j], hash.get(A[j]) + 1);
                }

            }
            hash.put(A[i], hash.get(A[i]) - 1);
        }
        return res + 1;
    }

    //计算一个数的阶乘
    private long factorial(int num) {
        long res = 1;
        for (int i = 1; i <= num; i++) {
            res *= (long)i;
        }

        return res;
    }

    //计算一组数字全排列产生的数字的个数，key代表一位数字，value表示这位数字出现的次数

    long numberOfAllPermutation(HashMap<Integer, Integer> hash) {
        long denominator = 1;
        int sum = 0;
        for (int value: hash.values()) {
            if (value == 0)
                continue;
            denominator *= factorial(value);
            sum += value;
        }
        if (sum == 0)
            return 0;

        return factorial(sum) / denominator;

    }
















}
