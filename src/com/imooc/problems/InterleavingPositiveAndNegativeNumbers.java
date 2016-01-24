package com.imooc.problems;

/**
 * Created by dnzyt on 1/23/16.
 */
public class InterleavingPositiveAndNegativeNumbers {
    public void rerange(int[] A) {
        boolean isNegative = false;
        for (int i = 0; i < A.length; i++) {
            if (isNegative) {
                for (int j = i; j < A.length; j++) {
                    if (A[j] < 0) {
                        int temp = A[i];
                        A[i] = A[j];
                        A[j] = temp;
                        break;
                    }
                }

            } else {
                for (int j = i; j < A.length; j++) {
                    if (A[j] > 0) {
                        int temp = A[j];
                        A[i] = A[j];
                        A[j] = temp;
                        break;
                    }
                }
            }
            isNegative = !isNegative;
        }

        if (A[A.length - 1] * A[A.length - 2] > 0) {
            int temp = A[A.length - 1];
            for (int i = A.length - 1; i > 0; i--) {
                A[i] = A[i - 1];
            }
            A[0] = temp;
        }
    }
}
