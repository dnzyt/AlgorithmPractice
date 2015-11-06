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

        //n-1λ�����nλС����ônλ��n-1����λ�ú�ʣ�µ�n-1����ȫ���У�����ԭ����С
        //�����Դ����Ƶ����1һλ���ܼ������ԭ���ִ�����ж���

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

    //����һ�����Ľ׳�
    private long factorial(int num) {
        long res = 1;
        for (int i = 1; i <= num; i++) {
            res *= (long)i;
        }

        return res;
    }

    //����һ������ȫ���в��������ֵĸ�����key����һλ���֣�value��ʾ��λ���ֳ��ֵĴ���

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
