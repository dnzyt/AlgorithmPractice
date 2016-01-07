package com.imooc.problems;

/**
 * Created by dnzyt on 1/6/2016.
 */
public class FirstMissingPositive {
    public int firstMissingPositive(int[] A) {
        if (A == null || A.length == 0)
            return 1;

        for (int i = 0; i < A.length; i++) {
            while (A[i] > 0 && A[i] <= A.length && A[i] != i + 1) {
                int temp = A[A[i] - 1];
                if (temp == A[i])
                    break;
                A[A[i] - 1] = A[i];
                A[i] = temp;
            }
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] != i + 1)
                return i + 1;
        }

        return A.length + 1;
    }

}
